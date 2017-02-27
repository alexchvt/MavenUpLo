package com.simplon.MavenUpLo;

/**
 * Created by alex on 27/02/2017.
 */
public class Chain {
    private String myChain;
    private String newChain;

    public Chain (String myChain, String newChain){
        this.myChain = myChain;
        this.newChain = newChain;
    }

    public String transform() {
        for (char c : myChain.toCharArray()) {
            char d = '0';
            if (c <= 'Z' && c >= 'A') {
                d = (char) ((int) c + 32);
                newChain += d;
            } else if (c <= 'z' && c >= 'a') {
                d = (char) ((int) c - 32);
                newChain += d;
            } else {
                System.out.println("votre chaine contient un caractère invalide");
                newChain = "Erreur";
                break;
            }
        }
        return newChain;
    }
}
