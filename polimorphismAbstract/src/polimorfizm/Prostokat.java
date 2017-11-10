package polimorfizm;

/**
 * Created by karol on 02.10.17.
 */
public class Prostokat extends Figura {
    private int a, b;

    public Prostokat(int a1,int b1,String c,Boolean w) {
        super(c,w);
        a = a1;
        b = b1;
    }

    public void Pokaz(){
        System.out.println( "BokA:"+a+" BokB:"+b+ " Kolor :" + color + ", wypelnienie: " + wypelnienie);

    }
    public double obliczPole(){
        return a*b;
    }

}
