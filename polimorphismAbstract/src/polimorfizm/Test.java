package polimorfizm;

import java.lang.reflect.Array;

/**
 * Created by karol on 27.09.17.
 */
public class Test {
    public static void main(String[] args) {

        Prostokat pr = new Prostokat(3, 4, "zielonego", false);
//        pr.Pokaz();
        Kolo ko = new Kolo(9, "Biały", true);
//        ko.Pokaz();

        Figura[] arrayOfFig;
        arrayOfFig = new Figura[2];
        arrayOfFig[0] = pr;
        arrayOfFig[1] = ko;

//        arrayOfFig[0].Pokaz();
//        arrayOfFig[1].Pokaz();
// Dzieki temu ze wywolujemy metode pokaz
        for (int i = 0; i < 2; ++i) {
            arrayOfFig[i].Pokaz();
        }



    }

}
