import java.util.Scanner;

public class Greeting {

    void say_hello() {
        System.out.println("Hello, welcome!");
    }

    public static void main(String[] args) {

        Greeting g1 = new Greeting();
        Greeting g2 = new Greeting();
        Greeting g3 = new Greeting();

        g1.say_hello();
        g2.say_hello();
        g3.say_hello();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        if (visitors > 5) {
            System.out.println("Busy Day");
        } else {
            System.out.println("Normal Day");
        }

        sc.close();
    }
}