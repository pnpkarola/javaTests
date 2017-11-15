package com.company;

import javax.jnlp.IntegrationService;
import java.util.*;
import java.util.BitSet;

public class Bity {
    BitSet sked;

    public Bity() {
        sked = new BitSet(365);
        int[] holiday = {1, 15, 50, 148, 185, 246, 281, 316, 326, 359};
        for (int i = 0; i < holiday.length; i++) {
            addHoliday(holiday[i]);
        }


    }


    public void addHoliday(int dayToAdd) {
        sked.set(dayToAdd);
    }

    public boolean isHoliday(int dayToCheck) {
        boolean result = sked.get(dayToCheck);
        return result;
    }


    public static void main(String[] args) {

        Bity cal = new Bity();
        Integer numer;
        Scanner read = new Scanner(System.in);

        System.out.println("Podaj numer");
        numer = read.nextInt();
        System.out.println("Podales "+numer);

//        if (numer.length > 0) {
//            try {
//                int whichDay = Integer.parseInt(arguments[0]);
//                if (cal.isHoliday(whichDay)) {
//                    System.out.println("Dzieñ numer " + whichDay +
//                            " to ĂwiÚto.");
//                } else {
//                    System.out.println("Dzieñ numer " + whichDay +
//                            " to nie ĂwiÚto.");
//                }
//            } catch (NumberFormatException nfe) {
//                System.out.println("BïÈd: " + nfe.getMessage());
//            }
//        }
    }

}
