package animals;

public class Cat extends Animal {
    public String name;

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}
