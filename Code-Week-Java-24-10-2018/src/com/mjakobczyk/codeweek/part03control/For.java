package com.mjakobczyk.codeweek.part03control;

public class For {

    public static void main(String[] args) {

        String napis = "Cokolwiek";

        // Naiwne podejscie - wypisz 5 razy to samo.
        System.out.println(napis);
        System.out.println(napis);
        System.out.println(napis);
        System.out.println(napis);
        System.out.println(napis);
        System.out.println('\n');

        // Jak zrobic to lepiej? Za pomoca petli
        int ileRazy = 5;
        for (int i = 0; i < ileRazy; i++) {
            System.out.println(napis);
        }

        // --------------------
        //     ZADANIE
        // --------------------
        // Napisz program, ktory wypisuje kolejnych 10 liczb naturalnych
        // (od 1 do 10) oraz ich potegi.

    }
}