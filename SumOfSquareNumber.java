
import java.util.Scanner;

public class SumOfSquareNumber {

    public static boolean judgeSquareSum(int c) {
        long i = 0;
        long j = (long)Math.sqrt(c);
        while(i<=j){
            if(i*i + j*j == c) return true;
            else if(i*i + j*j > c) j--;
            else i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check sum of square: ");
        int c = sc.nextInt();

        System.out.println(judgeSquareSum(c));
        sc.close();
    }
}
