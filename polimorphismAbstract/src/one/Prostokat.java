package one;

/**
 * Created by karol on 02.10.17.
 */
public class Prostokat extends Figura {
    private int a, b;

    public Prostokat(int a1,int b1) {
        this.a = b1;
        this.b = b1;
    }

    public double ObliczPole() {
        return this.a * this.b;
    }

}
