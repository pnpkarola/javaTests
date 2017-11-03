package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> wyrazy = new ArrayList<String>();
        wyrazy.add("To");
        wyrazy.add("jest");
        wyrazy.add("nasza");
        wyrazy.add("wspaniala");
        wyrazy.add("lista");


        System.out.println(wyrazy);
        for(String s:wyrazy)
            System.out.print(s+" ");
            System.out.println();

            wyrazy.add(1,"nie");

        for (String s:wyrazy)
            System.out.print(s+" ");

    }
}
