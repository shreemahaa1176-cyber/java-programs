import java.util.Scanner;

public class ScholarshipEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 75) {
            System.out.println(name + ": Eligible for Scholarship");
        } else {
            System.out.println(name + ": Not Eligible for Scholarship");
        }

        sc.close();
    }
}