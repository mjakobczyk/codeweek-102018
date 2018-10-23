package com.mjakobczyk.codeweek.part03control;

public class IfElse {

    public static void main(String[] args) {
        boolean piszeTerazWJavie = true;

        // Wersja poprawna, ale nadmiarowa
        if (piszeTerazWJavie == true) {
            System.out.println("Tak, pisze teraz w Javie");
        }
        else if (piszeTerazWJavie == false) {
            System.out.println("Nie, nie pisze teraz w Javie");
        }

        boolean czyWartoPisacNadmiarowo = false;

        // Poprawna konstrukcja bez nadmiarowosci kodu
        if (czyWartoPisacNadmiarowo) {
            System.out.println("Jasne, ze warto pisac nadmiarowo!");
        }
        else {
            System.out.println("Nie, nie warto pisac nadmiarowo!");
        }

        // --------------------
        //     ZADANIE
        // --------------------
        // Napisz program, ktory wczytuje od uzytkownika liczbe calkowita.
        // Jezeli liczba calkowita jest < 100 to wypisz na konsoli "Za malo".
        // Jezeli liczba calkowita jest > 100 to wypisz na konsoli "Za duzo".
        // Jezeli liczba calkowita jest = 100 to wypisz na konsoli "Idealnie".
        // Podpowiedz: wykorzystaj przyklad z InputStream (part01introduction).
        // Do zczytania inputu od uzytkownika sluzy metoda next() skanera
        // (tak jak jest pokazane w przykladzie).

        // ...
    }
}