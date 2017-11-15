package polimorfizm;
/**
 * Created by karol on 27.09.17.
 */
public class TestPolimorph {
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
// Dzieki polimorfizmowi wywolujemy  metode Pokaz na klasie bazowej Figura a i tak wiadomo skad ma wywolac Pokaz.
// póżne wiązanie
        for (int i = 0; i < 2; ++i) {
            arrayOfFig[i].Pokaz();
            }



    }

}
