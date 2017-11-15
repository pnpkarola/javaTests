package rzutowanie;


public class TestCast {

    public static void main(String[] args) {

        Figura pr = new Prostokat(3, 4, "zielonego", false);
//        pr.obliczPole();  // zwykle wywolanie konkretnej metody
        Kolo ko = new Kolo(9, "Biały", true);
//        ko.obliczPole();  // zwykle wywolanie konkretnej metody

        Figura[] arrayOfFig;
        arrayOfFig = new Figura[2];
        arrayOfFig[0] = pr;
        arrayOfFig[1] = ko;


//wykorzystanie rzutowania - nie trzeba miec metody obliczPole() w klasie bazowej ale jest bardziej skomplikowane

        for (int i = 0; i < arrayOfFig.length; ++i) {
            if (arrayOfFig[i] instanceof Kolo) {
                System.out.println("Jest object of kolo");
                System.out.println(((Kolo) arrayOfFig[i]).obliczPole());
            } else if (arrayOfFig[i] instanceof Prostokat) {
                System.out.println("Jest object of prostokat");
                System.out.println(((Prostokat) arrayOfFig[i]).obliczPole());
            }

        }

    }


}
