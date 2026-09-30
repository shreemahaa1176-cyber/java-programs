import java.util.Scanner;

public class BankBalance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int deposit = 3500;

        balance += deposit;

        System.out.println("New Balance = ₹" + balance);

        sc.close();
    }
}