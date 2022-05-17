package transport;

import java.util.Scanner;

public abstract class Cuxoput implements TS {
    boolean colesa;
    boolean guseneci;

    public Cuxoput(boolean colesa, boolean guseneci) {
        this.colesa = colesa;
        this.guseneci = guseneci;
        if (colesa) {
            guseneci = false;
        } else {
            guseneci = true;
        }
    }

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
