import java.util.Scanner;

public class MeterReading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current meter reading: ");
        int reading = sc.nextInt();

        reading++;

        System.out.println("Updated Meter Reading: " + reading);

        sc.close();
    }
}