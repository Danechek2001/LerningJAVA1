package Bank;

import java.util.Objects;

public class BCarta {
    String number;
    String data;
    String csv;
    double balance;

    public BCarta(String number, String data, String csv, double balance) {
        this.number = number;
        this.data = data;
        this.csv = csv;
        this.balance = balance;
    }

    public void PrintBalance() {
        System.out.println(balance + " рублей");
    }

    public void Sell(double a) {
        balance = balance - a;
        System.out.println(balance + " рублей");
    }

    public void App(double a) {
        balance = balance + a;
        System.out.println(balance + " рублей");
    }

    public void PrintData() {
        System.out.println(data);
    }

    public void Pro() {
        if (number.charAt(0) == '4') {
            System.out.println("Мастеркард");
        } else if (number.charAt(0) == '5') {
            System.out.println("Виза");
        } else {
            System.out.println("Мир");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BCarta bCarta = (BCarta) o;
        return Double.compare(bCarta.balance, balance) == 0 && Objects.equals(number, bCarta.number) && Objects.equals(data, bCarta.data) && Objects.equals(csv, bCarta.csv);
    }

}
