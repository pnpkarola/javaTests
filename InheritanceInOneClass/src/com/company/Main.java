package com.company;

class Bazowa {
    public final static int klasowa = 10;


    void nazwa() {
        System.out.println("Metoda klasy bazowej");
    }

    protected static void metodaKlasowaStatyczna() {

        System.out.println("Metoda klasowa/statyczna");

    }


}

class Pochodna extends Bazowa {
    void nazwa() {
        super.nazwa();
        System.out.println("Metoda klasy pochodnej");
    }
}

public class Main {

    public static void main(String[] args) {
//-- zmienne klasowe/statyczne
        Bazowa kursy1 = new Bazowa();
        Pochodna ksiazka1 = new Pochodna();
        kursy1.nazwa();
        ksiazka1.nazwa();

        System.out.println(kursy1.klasowa);
        System.out.println(Bazowa.klasowa);
        System.out.println(Pochodna.klasowa);

//-- metody klasowe/statyczne
        ksiazka1.metodaKlasowaStatyczna();
        kursy1.metodaKlasowaStatyczna();
        Bazowa.metodaKlasowaStatyczna();
        Pochodna.metodaKlasowaStatyczna();

    }
}
