package com.mjakobczyk.codeweek.part03control;

import java.util.Random;

public class BreakAndContinue {

    public static void main(String[] args) {

        int max = 100;
        Random generator = new Random();

        for (int i = 0; i < 100; ++i) {
            int liczbaLosowa = generator.nextInt( max);
            System.out.println(liczbaLosowa);
        }

        // --------------------
        //     ZADANIE
        // --------------------
        // Zaktualizuj program powyzej w nastepujacy sposob:
        // - nie wypisuj zadnej liczby podzielnej przez 2
        // - jesli licznik przekroczy 50 to zakoncz dzialanie petli wczesniej
        // Podpowiedz: skorzystaj ze slow kluczowych: continue i break

    }
}