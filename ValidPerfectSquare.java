import java.io.PrintStream;

class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        // if(num == 1) return true;
        // int left = 2;
        // int right = num/2;
        // while(left<right) {
        //     int mid = left + (right-left)/2;
        //     if(mid*mid == num) return true;
        //     else if(mid*mid > num) right = mid-1;
        //     else left = mid+1;
        // }
        long i=1;
        while(i*i <= num) {
            if(i*i == num) return true;
            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        int num = 401;
        ValidPerfectSquare obj = new ValidPerfectSquare();
        PrintStream ps = System.out;
        ps.println(obj.isPerfectSquare(num));
    }
}