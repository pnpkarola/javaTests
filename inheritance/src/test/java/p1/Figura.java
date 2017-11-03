package p1;
/**
 * Created by karol on 02.10.17.
 */

public class Figura {

    public String kolor;


    public Figura (){
        kolor ="brak koloru";
    }
    public Figura (String k){
        kolor =k;
    }

    public String Pokaz(){
        System.out.println("Kolor:"+ this.kolor);
        return this.kolor;
    }

    public void printMethod() {
        System.out.println("Printed in Figura.");
    }

}
