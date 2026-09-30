import java.util.Scanner;

public class MonthlyExpenseBudgetAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget;
        double totalExpense = 0;
        int choice;
        int count = 1;

        System.out.print("Enter your monthly budget: ");
        budget = sc.nextDouble();

        System.out.print("How many expenses do you want to enter? ");
        int n = sc.nextInt();

        // for loop to enter multiple expenses
        for (int i = 1; i <= n; i++) {

            System.out.println("\nExpense " + i);

            // switch to select category
            System.out.println("Choose Expense Category:");
            System.out.println("1. Food");
            System.out.println("2. Travel");
            System.out.println("3. Education");
            System.out.println("4. Shopping");=
            System.out.println("5. Other");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            String category;

            switch (choice) {
                case 1:
                    category = "Food";
                    break;

                case 2:
                    category = "Travel";
                    break;

                case 3:
                    category = "Education";
                    break;

                case 4:
                    category = "Shopping";
                    break;

                case 5:
                    category = "Other";
                    break;

                default:
                    category = "Other";
                    System.out.println("Invalid choice. Category set to Other.");
            }

            System.out.print("Enter expense amount: ");
            double expense = sc.nextDouble();

            totalExpense = totalExpense + expense;

            System.out.println("Category: " + category);
            System.out.println("Amount: Rs." + expense);
        }

        // while loop for summary
        while (count <= 1) {

            System.out.println("\n========== SUMMARY REPORT ==========");
            System.out.println("Monthly Budget : Rs." + budget);
            System.out.println("Total Expenses : Rs." + totalExpense);

            // if-else to compare budget and expenses
            if (totalExpense > budget) {

                double overspent = totalExpense - budget;

                System.out.println("Status         : OVER BUDGET");
                System.out.println("Overspent      : Rs." + overspent);

            } else {

                double remaining = budget - totalExpense;

                System.out.println("Status         : WITHIN BUDGET");
                System.out.println("Remaining      : Rs." + remaining);
            }

            count++;
        }

        sc.close();
    }
}