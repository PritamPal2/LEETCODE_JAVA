class PrimeInDiagonal {
    public static int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int largestPrime = 0;
        int i = 0;

        while (i < n) {

            int n1 = nums[i][i];
            if (n1 >= 2) {
                boolean prime = true;
                for (int j = 2; j * j <= n1; j++) {
                    if (n1 % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime && n1 > largestPrime) {
                    largestPrime = n1;
                }
            }
        
            int n2 = nums[i][n - i - 1];        
            if (n2 >= 2) {
                boolean prime = true;           
                for (int j = 2; j * j <= n2; j++) {
                    if (n2 % j == 0) {
                        prime = false;
                        break;
                    }
                }           
                if (prime && n2 > largestPrime) {
                    largestPrime = n2;
                }
            }

            i++;
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{5,6,7},{9,10,11}};
        System.err.println(diagonalPrime(nums));
    }
}