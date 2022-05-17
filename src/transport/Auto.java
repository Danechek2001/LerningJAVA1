package transport;

public class Auto extends Cuxoput {

    private double weight;
    private double cost;
    private double power;

    public Auto(double weight, double cost, double power) {
        super(true);
        this.weight = weight;
        this.cost = cost;
        this.power = power;

    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double getPower() {
        return power;
    }
}
