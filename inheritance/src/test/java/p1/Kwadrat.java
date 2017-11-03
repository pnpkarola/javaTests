package p1;

/**
 * Created by karol on 03.10.17.
 */
public class Kwadrat extends Prostokat {

    private int bok;

    public Kwadrat(int a){
        this.bok = a;
    }

    public double ObliczPole(){
        System.out.println("Pole "+this.getClass().getName()+":"+this.bok*this.bok);
        return this.bok*this.bok;

    };

    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Kwadrat");
    }
}
