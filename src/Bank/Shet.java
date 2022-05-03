package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Shet {
    String number;
    User vladelec;
    ArrayList<BCarta> carts = new ArrayList<BCarta>();

    public Shet(String number, User vladelec, ArrayList<BCarta> carts) {
        this.number = number;
        this.vladelec = vladelec;
        this.carts = carts;
    }

    public double getSumm() {
        double a = 0;
        for (BCarta i : carts) {
            a += i.balance;
        }
        return a;
    }

    public double max() {
        double a = 0;
        for (BCarta i : carts) {
            if (a < i.balance){
                a += i.balance;
            }
        }
        return a;
    }
    public boolean V(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean b = false;
        for (BCarta i : carts) {
            if (a.equals(i.number)){
                b = true;
            }
        }
        return b;
    }

}
