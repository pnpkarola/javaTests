package com.company;

/**
 * Created by karol on 16.12.17.
 */
public class Wyliczeniowy {
    public enum DzienTygodnia
    {
        PONIEDZIALEK(1,"po"),WTOREK(2,"wt"),SRODA(3,"sr"),CZWARTEK(4,"czw"),PIATEK(5,"pi"),SOBOTA(6,"so"),NIEDZIELA(7,"nd");
        private int numer;
        private  String skr;

        private DzienTygodnia(int n, String s) {
            numer = n;
            skr = s;
        }

        public String toString(){
            return numer+" Dzien tyodnia: "+super.toString()+",skrot:"+skr;
        }
    }

    public static void main(String[] args) {
        DzienTygodnia dpo = DzienTygodnia.PONIEDZIALEK;

        if(dpo == DzienTygodnia.PONIEDZIALEK) System.out.println("super");

//        for(DzienTygodnia d:DzienTygodnia.values())
//            System.out.println(d);




    }

}


