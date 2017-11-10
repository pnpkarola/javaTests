package rzutowanie;


public class Kolo extends Figura {
    private int r;

    public Kolo(int rad, String c, Boolean w) {
        super(c, w);
        r = rad;
    }

    public void Pokaz() {
        System.out.println("Promien:" + r + " Kolor:" + color + ", wypelnienie:" + wypelnienie);

    }

    public double obliczPole() {
        final double pi = Math.PI * r * r;
        return pi;
    }


}
