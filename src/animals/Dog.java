package animals;

public class Dog extends Animal {
    public String sex;
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}
