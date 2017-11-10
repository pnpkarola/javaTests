package rzutowanie;

/**
 * Created by karol on 02.10.17.
 */
public   class Figura {

    public String color;
    public boolean wypelnienie;

    //kontruktor
    public Figura(String c, boolean w) {
        color = c;
        wypelnienie = w;
    }

    //konstruktor domyslny
    public Figura() {
        this("Czarny", false);
    }

    protected void Pokaz() {
        System.out.println( "Kolor :" + color + ", wypelnienie: " + wypelnienie);
    }




}
