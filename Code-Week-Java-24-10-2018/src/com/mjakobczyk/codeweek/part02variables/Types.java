package com.mjakobczyk.codeweek.part02variables;

public class Types {

    public static void main(String[] args) {

        // int - zmienna liczbowa typu calkowitego
        // Deklaracja
        int liczba;

        // Po deklaracji mozna do zmiennej przypisac wartosci:
        liczba = 1;
        System.out.println("Obecnie liczba wynosi: " + liczba);

        // Zle - dlaczego to nie dziala? Odkomentuj i sprawdz
        // int liczba1 = 1;

        liczba = 2;
        System.out.println("A teraz liczba wynosi: " + liczba);

        liczba = 72638950;
        System.out.println("Na koniec liczba wynosi: " + liczba);

        // Deklaracja i przypisanie
        int liczba2 = 25;
        System.out.println("Liczba2: "  + liczba2);

        // bool - zmienna typu logicznego
        boolean ladnaPogoda = false;
        System.out.println("Zdanie: 'Dzisiaj jest ladna pogoda' jest: " + ladnaPogoda);

        // char - zmienna typu znakowego
        char znak = 'a';
        System.out.println("Zmienna znak to: " + znak);

        // Do zmiennej typu char przypisujemy znak z wykorzystaniem ' ', a nie " "
        // Zle:
        // char b = "b";

        // String - zmienna typu lancucha znakowego
        String lancuch = "Code Week 2018";
        System.out.println("Dzisiejsze wydarzenie to: " + lancuch);

        // Zle:
        // string innyLancuch = "A ten lancuch sie nie wyswietli";

        // double - liczby zmiennoprzecinkowe
        double temperatura = 1.5;
        System.out.println("Temperatura rano za oknem wynosila " + temperatura + " stopnia!");
    }
}