package transport;

public class Auto extends Cuxoput{
    public Auto(boolean colesa, boolean guseneci) {
        super(colesa, guseneci);
    }

    @Override
    public void makeSound() {

    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public double power() {
        return 0;
    }
}
