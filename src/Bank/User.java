package Bank;

public class User {
    String f;
    String i;
    String o;
    String sex;
    int age;
    String numberP;
    String seriaP;

    public User(String f, String i, String o, String sex, int age, String numberP, String seriaP) {
        this.f = f;
        this.i = i;
        this.o = o;
        this.sex = sex;
        this.age = age;
        this.numberP = numberP;
        this.seriaP = seriaP;
    }

    public void ageM() {
        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Нет 18");
        }
    }
}
