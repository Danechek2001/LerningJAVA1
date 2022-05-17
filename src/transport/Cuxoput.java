package transport;

import java.util.Scanner;

public abstract class Cuxoput implements TS {
    boolean colesa;
    boolean guseneci;

    Cuxoput(boolean colesa){
        this.colesa = colesa;
        this.guseneci = !colesa;
    }

    public double calculateSceplenie(){
        if (colesa){
            return  4 * getWeight();
        } else {
            return 2 * 10 * getWeight();
        }
    }

}
