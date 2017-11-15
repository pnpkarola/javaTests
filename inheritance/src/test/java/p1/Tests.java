package p1;

/**
 * Created by karol on 02.10.17.
 */
public class Tests {

    public Tests() {

    }

    public void Palindrom(String g) {
        int l = 0;

        char c = g.charAt(0);  // returns 'l'
        char[] c_arr = g.toCharArray();
//        System.out.println(c);
//        System.out.println(c_arr);
//
//        System.out.println("Dlugosc: "+c_arr.length);
        for (int i = 0; i < c_arr.length; i++) {

            if (c_arr[i] == c_arr[c_arr.length - 1 - i]) {
                System.out.println(c_arr[i]);
                l++;

            }
        }
        if (l==c_arr.length){
            System.out.println(g+" to PALINDROM");
        }

    }


    public static void main(String[] args) {
//        Figura f1 = new Figura("zielonego");  //utworzenie obiektu klasy bazowej
//        System.out.println(f1.Pokaz());

//        Kolo k1 = new Kolo(3,"biale"); //utworzenie obiektu klasy potomnej
//        k1.Pokaz(); // wywolanie metody odziedziczonej

        Prostokat pr1 = new Prostokat(5,7,"red");
        pr1.Pokaz();
        pr1.ObliczPole();
        pr1.printMethod();


//
        Kwadrat kw = new Kwadrat(2);
        kw.ObliczPole();
        kw.printMethod();
//        System.out.println(kw.getClass());
//
//        Romb ro1 = new Romb(2,5);
//        Romb ro2 = new Romb(2,5,6);
//
//        ro1.ObliczPole();

//
//        Tests qa = new Tests();
//        qa.Palindrom("kkajakk");


    }


}
