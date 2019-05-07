package edu.catolicasc.estrutura.file;

import java.util.ArrayList;

public class RabinKarp {
    private String text;
    private String pattern;
    private ArrayList<Integer> findings;

    public RabinKarp(String text, String pattern) {
        this.text = text;
        this.pattern = pattern;
        this.findings = new ArrayList<>();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPattern() {
        return pattern;
    }

    public ArrayList<Integer> search(){
        for (int i = 0; i <= this.text.length() - this.pattern.length(); i++) {
            Integer pat = pattern.hashCode();
            Integer word = (text.substring(i, i + pattern.length()).hashCode());
            if (pat.equals(word)){
                this.findings.add(i);
            }
        }
        return this.findings;
    }


}
