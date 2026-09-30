public class SkipEvens {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue;   // skip even numbers
            }
            System.out.println(i);
        }
    }
}