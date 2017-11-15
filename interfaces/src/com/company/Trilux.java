package com.company;

/**
 * Created by karol on 08.11.17.
 */
public class Trilux extends TVabs implements ChangeChannel {

    @Override
    public void onTV(boolean b) {
        if(b)
            System.out.println("TV is on");
        else
            System.out.println("TV is off");
        System.out.println();
    }


    @Override
    public void changeChannel() {
        System.out.println("Zmiana kanału");
    }
}
