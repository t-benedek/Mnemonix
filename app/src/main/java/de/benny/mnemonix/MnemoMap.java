package de.benny.mnemonix;

import java.util.HashMap;

/**
 * Created by Benny on 01.11.2017.
 */

public class MnemoMap<Integer, String> extends HashMap<java.lang.Integer, java.lang.String> {

    public MnemoMap() {
        init();
    }

    private void init() {
        this.put(1, "Tee");
        this.put(2, "Noah");
        this.put(3, "Mai");
        this.put(4, "Reh");
        this.put(5, "Lee");
        this.put(6, "Schah");
        this.put(7, "Kuh");
        this.put(8, "Fee");
        this.put(9, "Po");

        this.put(10, "Tasse");
        this.put(11, "titte");
        this.put(12, "tanne");
        this.put(13, "damm");
        this.put(14, "teer");
        this.put(15, "tal");
        this.put(16, "tasche");
        this.put(17, "taxi");
        this.put(18, "taufe");
        this.put(19, "depp");

    }

    public String getMnemo(int key) {
        return (String) this.get(key);
    }

    public int getSize() {
        return this.size();
    }
}
