import java.util.Scanner;

public class Calculator {

    void show_units() {
        System.out.println("Units: cm, kg, litre");
    }

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.show_units();
        c2.show_units();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}