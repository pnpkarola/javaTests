package com.company;

public class WatkiDemo implements Runnable {
    String nazwa;
    Thread t;

    public WatkiDemo(String nazwaWatku) {
        nazwa = nazwaWatku;
        t = new Thread(this.nazwa);
        System.out.println("watek" + t);
        t.start();

    }

    public static void main(String[] args) {

//        Thread trh = Thread.currentThread();
//        System.out.println("Threads" + trh);
//
//
//        try {
//            for (int n = 5; n > 0; n--) {
//                System.out.println(n);
//                Thread.sleep(1000);
//            }
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            System.out.println("Thread paused");
//        }
//
//        System.out.println("Thread finished");
//        ----------------------pierwszy przykład-----------------------------

        new WatkiDemo("Pierwszy");
        new WatkiDemo("Drugi");
        new WatkiDemo("Trzeci");


    }

    @Override
    public void run() {

        try {

            for (int n = 5; n > 0; n--) {
                System.out.println(nazwa);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Przerwany watek: " + nazwa);

        }

        System.out.println("Zakonczony watek: " + nazwa);

    }
}
