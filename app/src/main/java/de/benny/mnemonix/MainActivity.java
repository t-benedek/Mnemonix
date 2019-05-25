package de.benny.mnemonix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MnemoMap mnemoMap = new MnemoMap();
    private String currWord = null;
    private String result;
    private int currKey = 1;
    private int numbersTries = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currKey = getRandomKey();
        currWord = (String) mnemoMap.getMnemo(currKey);

        resetField(R.id.resultLabel, "");

        // initial setup for questoinLabel and Result
        askQuestion(currKey);
    }

    private void askQuestion(int key) {
        resetField(R.id.questionLabel, "Was ist das Wort für <" + key + "> ");
        resetField(R.id.mnemText, "");
    }

    private void resetField(int mnemText, String text) {
        TextView mnemoText = findViewById(mnemText);
        mnemoText.setText(text);
    }

    private void checkValue() {
        TextView mnemoText = findViewById(R.id.mnemText);
        String inputText = mnemoText.getText().toString().toLowerCase().trim();

        numbersTries++;
        TextView resultLabel = findViewById(R.id.resultLabel);

        if (inputText.equals(currWord.toLowerCase())) {
            resultLabel.setText("<" + inputText + "> war richtig.");
        } else {
            resultLabel.setText("<" + inputText + "> war leider falsch.");
        }

        currKey = getRandomKey();
        currWord = (String) mnemoMap.getMnemo(currKey);

        askQuestion(currKey);
    }

    private int getRandomKey() {
        return 1 + (int)(Math.random() * mnemoMap.getSize());
    }

    // called when the check button is pressed
    public void checkMnemo(View view) {
        checkValue();
    }
}
