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
        System.out.println("/----------------- zmienne klasowe/statyczne--------------------/");
        Bazowa kursy1 = new Bazowa();
        Pochodna ksiazka1 = new Pochodna();
        kursy1.nazwa();
        ksiazka1.nazwa();

        System.out.println(kursy1.klasowa);
        System.out.println(Bazowa.klasowa);
        System.out.println(Pochodna.klasowa);

//-- metody klasowe/statyczne
        System.out.println("/----------------- metody klasowe/statyczne--------------------/");
        ksiazka1.metodaKlasowaStatyczna();
        kursy1.metodaKlasowaStatyczna();
        Bazowa.metodaKlasowaStatyczna();
        Pochodna.metodaKlasowaStatyczna();

//-- rzutowanie typów protych
        System.out.println("/------------------rzutowanie typów protych--------------------/");
        byte b = 120;
        int byteNaInt = (int)b;
        System.out.println(byteNaInt);
        char byteNaChar = (char)b;
        System.out.println(byteNaChar);
        System.out.println(((Object)byteNaInt).getClass().getName());
        System.out.println(((Object)byteNaChar).getClass().getName());

//-- rzutowanie obiektów
        System.out.println("/------------------rzutowanie obiektow--------------------/");
        Bazowa bazowa1 = new Bazowa();
        Pochodna pochodna1 = new Pochodna();
        bazowa1 = pochodna1; // uzycie jako nadklasy nie wymaga rzutowania - rzutowanie bazowej na pochodną
        System.out.println((bazowa1).getClass().getName());


        Bazowa bazowa2 = new Bazowa();
//        Pochodna pochodna2 = new Pochodna();
//        pochodna2 = bazowa2; - tak sie nie da
//         pochodna2 = (Bazowa)pochodna2;
        Bazowa base = new Pochodna();
        base.nazwa();
        System.out.println((base).getClass().getName());

//--Konwersja typów podstawowych na obiekty i odwrotnie
        Integer dataCount = new Integer(7801);
        int newCount = dataCount.intValue();


//-- operator trójargumentowy
        System.out.println("/---------------operator trójargumentowy-----------------------/");
        int myScore = 10;
        int yourScore = 40;
        int ourBestScore = myScore > yourScore ? myScore : yourScore;
        System.out.println(ourBestScore);










    }
}
