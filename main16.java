class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
 
public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));       // int, int
        System.out.println(c.add(2, 3, 4));    // int, int, int
        System.out.println(c.add(1.5, 2.5));   // double, double
    }
}