import java.util.Scanner;

public class TrafficSignal {

    void signal_rules() {
        System.out.println("Red: Stop, Yellow: Ready, Green: Go");
    }

    public static void main(String[] args) {

        // Creating 3 objects
        TrafficSignal t1 = new TrafficSignal();
        TrafficSignal t2 = new TrafficSignal();
        TrafficSignal t3 = new TrafficSignal();

        // Calling method for each object
        t1.signal_rules();
        t2.signal_rules();
        t3.signal_rules();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal color: ");
        String color = sc.nextLine();

        if (color.equalsIgnoreCase("Red")) {
            System.out.println("Stop");
        } else if (color.equalsIgnoreCase("Yellow")) {
            System.out.println("Ready");
        } else if (color.equalsIgnoreCase("Green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid signal color");
        }

        sc.close();
    }
}