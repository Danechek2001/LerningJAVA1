package transport;

import java.util.Scanner;

public abstract class Vozdushnie implements TS{
    Scanner sc = new Scanner(System.in);
    @Override
    public double weight() {
        double a = sc.nextDouble();
        return a;
    }

    public abstract void makeSound();

    public abstract double cost();

    public abstract double power();
}
