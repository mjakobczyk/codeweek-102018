package com.mjakobczyk.codeweek.part01introduction;

public class InputStream {

    public static void main (String[] args) {
        // --------------------
        //     ZADANIE
        // --------------------
        // Uruchom ponizszy program i przetestuj jego dzialanie

        // System.in - strumien wejsciowy
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Podaj swoje imie:");
        if (sc.hasNextLine()) {
            System.out.println("Czesc " + sc.next() + "! :)");
            System.out.println("Witamy na Code Week 2018!");
        }

    }
}
