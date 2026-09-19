import java.util.ArrayList;
import java.util.Scanner;

class PascalTriangle2 {

    public static ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        long value = 1;
        for(int i=0;i<=rowIndex;i++) {
            list.add((int) (value));
            value = value * (rowIndex - i) / (i + 1);
        }
        return list;
    }

    public static void printSolution(ArrayList<Integer> pascalTriangle2) {

    int count = 1;

    for (Integer row : pascalTriangle2) {
        System.out.println(count + ": " + row);
        count++;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter row Number: ");
        int rowIndex = sc.nextInt();
        System.err.println(getRow(rowIndex));
    }
}