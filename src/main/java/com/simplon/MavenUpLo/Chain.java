package com.simplon.MavenUpLo;

/**
 * Created by alex on 27/02/2017.
 */
public class Chain {


    public String toAlternativeString(String input) {
        String result = "";
        char[] letters = input.toCharArray();

        for (char letter : letters) {
            if (letter <= 'Z' && letter >= 'A') {
                result += upperToLowerByUnicode(letter);
            }
            else if (letter <= 'z' && letter >= 'a') {
                result += lowerToUpperByUnicode(letter);
            }
            else {
                System.out.println("votre chaine contient un caractère invalide");
                result = "Erreur";
                break;
            }
        }
        return result;
    }

    private char upperToLowerByUnicode (char letter){
        int d = ( letter + 32);
        return (char) d;
    }

    private char lowerToUpperByUnicode (char letter){
        int d = ( letter - 32);
        return (char) d;
    }
}
