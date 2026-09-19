// import java.math.BigInteger;
import java.util.ArrayList;

class PascalTriangle {
    /*
    private BigInteger factorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        }

        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                BigInteger value = factorial(i).divide(factorial(j).multiply(factorial(i - j)));    
                row.add(value.intValue());
            }
            pascalTriangle.add(row);
        }

        return pascalTriangle;
    }
    */


    // FORMULA OF CALCULATE PASCAL TRIANGLE
    // C(n,k) = [C(n,k−1) × (n−k+1​) ] / k
    // C(i, j+1) = [C(i, j) × (i-j​) ] / (j+1)
    public ArrayList<ArrayList<Integer>> generate(int numRows) {

        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            ArrayList<Integer> row = new ArrayList<>();
            long value = 1;

            for (int j = 0; j <= i; j++) {
                row.add((int) value);

                value = value * (i - j) / (j + 1);
            }

            pascalTriangle.add(row);
        }

        return pascalTriangle;
    }

    public static void printSolutions(ArrayList<ArrayList<Integer>> pascalTriangle) {
        int count = 1;

        for (ArrayList<Integer> solution : pascalTriangle) {
            System.out.println("Solution " + count + ":");

            for (Integer row : solution) {
                System.out.print(row + " ");
            }

            System.out.println();
            System.out.println();
            count++;
        }
    }

    public static void main(String[] args) {
        int numRows = 30;
        PascalTriangle pascalTriangle = new PascalTriangle();
        ArrayList<ArrayList<Integer>> result = pascalTriangle.generate(numRows);

        if (result.isEmpty()) {
            System.out.println("No Solution Exists");
        } else {
            System.out.println("\nTotal Solutions: " + result.size());
            System.out.println();
            printSolutions(result);
        }
    }
}