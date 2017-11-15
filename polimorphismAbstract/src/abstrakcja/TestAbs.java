package abstrakcja;



public class TestAbs {

    public static void main(String[] args) {

        Figura pr = new Prostokat(3, 4, "zielonego", false);
//        pr.obliczPole();  // zwykle wywolanie konkretnej metody
        Kolo ko = new Kolo(9, "Biały", true);
//        ko.obliczPole();  // zwykle wywolanie konkretnej metody

        Figura[] arrayOfFig;
        arrayOfFig = new Figura[2];
        arrayOfFig[0] = pr;
        arrayOfFig[1] = ko;


//        wykorzystanie metody abstrakcyjnej obliczPole() z klasy Figura którą implementujemy w subklasach
        for (int i = 0; i < arrayOfFig.length; ++i) {
             System.out.println(arrayOfFig[i].obliczPole());
        }



    }

}
