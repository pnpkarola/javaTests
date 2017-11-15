package p1;

/**
 * Created by karol on 03.10.17.
 */
public class Prostokat extends Figura{
    private int bokA;
    private int bokB;

    public Prostokat(int a, int b, String k){
        this.bokA = a;
        this.bokB = b;
        kolor = k;
    }

    public Prostokat(int a, int b){
        this.bokA = a;
        this.bokB = b;

    }

    public Prostokat(){

        this.bokA = 0;
        this.bokB = 0;

    }

    public double ObliczPole(){
        System.out.println("Pole "+this.getClass().getName()+":"+this.bokA*this.bokB);
        return this.bokA*this.bokB;

    };


    public void printMethod() {
       super.printMethod();
        System.out.println("Printed in Prostokat");
    }



}
