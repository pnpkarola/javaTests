package com.company;

class Kursy{
    final static int klasowa = 10;

    void nazwa (){
        System.out.println("Metoda klasy kursy");
    }
}
class Ksiazki extends Kursy{
    void nazwa (){
        super.nazwa();
        System.out.println("Metoda klasy ksiazki");
    }
}

public class Main {

    public static void main(String[] args) {

        Kursy kursy1 = new Kursy();
        kursy1.nazwa();
        System.out.println(kursy1.klasowa);
        System.out.println(Kursy.klasowa);

        System.out.println(Ksiazki.klasowa);

        Ksiazki ksiazka1 = new Ksiazki();
        ksiazka1.nazwa();





    }
}
