package com.mjakobczyk.codeweek.part04arrays;

public class Arrays {

    public static void main(String[] args) {

        // Tablica statyczna
        int a[]={33,3,4,5};

        // <name_of_array_>.length - property
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

        // Tablica dynamiczna
        int b[] = new int[5];

        b[0]=10;
        b[1]=20;
        b[2]=70;
        b[3]=40;
        b[4]=50;

        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }

        // --------------------
        //     ZADANIE
        // --------------------
        // Utworz tablice dynamiczna.
        // Wylosuj jej rozmiar z zakresu (1, 10>.
        // Nastepnie zainicjalizuj ja cala losowymi
        // wartosciami od 10 do 100 i wypisz.


    }
}