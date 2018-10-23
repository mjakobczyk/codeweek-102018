package com.mjakobczyk.codeweek.part06oop;

public class Classes {

    public static void main (String[] args) {
        // Przyklad utworzenia nowej instancji klasy
        MyClass myClass = new MyClass();

        // Przyklad wywolania metody klasy
        myClass.yell("Hurra, klasa dziala!");
    }
}

class MyClass {
    public void yell(String something) {
        System.out.println(something);
    }
}