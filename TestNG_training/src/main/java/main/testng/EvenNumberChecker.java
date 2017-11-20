package main.testng;

public class EvenNumberChecker {

    public boolean check( Integer n){
        if (n%2 ==0){
        System.out.println("Mamy PARZYSTA: "+n);
        return true;
    }
    else {
            System.out.println("Mamy NIEparzysta: "+n);
        }
        return false;
    }

}
