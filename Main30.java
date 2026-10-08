import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Parameterized constructor
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Calculates the total ticket amount
    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Provides a 10% discount if the number of tickets is 5 or more
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        } else {
            return 0.0;
        }
    }

    // Calculates the final amount after deducting the discount
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Displays the movie name, ticket price, number of tickets, discount, and final amount
    public void displayBill() {
        System.out.println("\n--- Booking Bill ---");
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f\n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount: %.2f\n", calculateTotal());
        System.out.printf("Discount: %.2f\n", calculateDiscount());
        System.out.printf("Final Amount: %.2f\n", calculateFinalAmount());
    }
}

public class Main30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = scanner.nextInt();

        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);
        ticket.displayBill();

        scanner.close();
    }
}