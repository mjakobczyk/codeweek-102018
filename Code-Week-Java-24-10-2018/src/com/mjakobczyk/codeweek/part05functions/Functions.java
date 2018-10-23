package com.mjakobczyk.codeweek.part05functions;

public class Functions {

    public static void main(String[] args) {
        myFunction();
        int liczba1 = 1, liczba2 = 2, liczba3;
        liczba3 = add(liczba1, liczba2);
        System.out.println("Wynik dodawania wynosi = " + liczba3);

        // --------------------
        //     ZADANIE
        // --------------------
        // Utworz tablice intow o dlugosci 5.
        // Zainicjalizuj jej pola dowolnymi wartosciami.
        // Napisz funkcje, ktora przyjmuje jako argument
        // tablice i podnosi jej wszystkie elementy
        // do kwadratu. Napisz funkcje wyswietlajaca
        // tablice. Wywolaj te funkcje w programie.

        // ...

    }

    public static void myFunction() {
        System.out.println("Hello from myFunction() !");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}