import java.util.Scanner;

public class CountNumberOfDigits {
    public int d(int n, int d) {
        int count = 0;

        for (int factor = 1; factor <= n; factor *= 10) {

            int higher = n / (factor * 10);
            int current = (n / factor) % 10;
            int lower = n % factor;

            if (d != 0) {

                if (current < d) {
                    count += higher * factor;
                }
                else if (current == d) {
                    count += higher * factor + lower + 1;
                }
                else {
                    count += (higher + 1) * factor;
                }

            } else {

                // Special case for digit 0
                if (higher == 0) {
                    continue;
                }

                if (current == 0) {
                    count += (higher - 1) * factor + lower + 1;
                }
                else {
                    count += higher * factor;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Upper range: ");
        int n = sc.nextInt();
        System.err.print("Enter digit: ");
        int d = sc.nextInt();
        CountNumberOfDigits obj = new CountNumberOfDigits();
        System.err.println(obj.d(n, d));
        
        sc.close();
    }
}