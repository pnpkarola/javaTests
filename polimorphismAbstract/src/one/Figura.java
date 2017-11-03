package one;

/**
 * Created by karol on 02.10.17.
 */
public class Figura {

    private String color;
    public  Figura(){
        this.color = "zielonego Domyslnego";
    }

    public  Figura(String c){
        this.color = c;
    }
     private void Pokaz(){

      System.out.println("Kolor :"+this.color);

     }

}
