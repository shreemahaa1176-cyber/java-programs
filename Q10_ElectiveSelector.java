import java.util.Scanner;

public class Q10_ElectiveSelector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1-AI");
        System.out.println("2-Web Dev");
        System.out.println("3-IoT");
        System.out.println("4-Cybersecurity");

        System.out.print("Choose your elective: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Elective Selected: Artificial Intelligence");
                break;

            case 2:
                System.out.println("Elective Selected: Web Development");
                break;

            case 3:
                System.out.println("Elective Selected: Internet of Things");
                break;

            case 4:
                System.out.println("Elective Selected: Cybersecurity");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}