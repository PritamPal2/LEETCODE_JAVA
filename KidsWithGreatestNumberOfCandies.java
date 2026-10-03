import java.util.ArrayList;

public class KidsWithGreatestNumberOfCandies {
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int largest = candies[0];
        for(int num : candies) {

            largest = Math.max(largest, num);

            // if(num > largest) {
            //     largest = num;
            // }
        }
        for(int num : candies) {
            list.add((num + extraCandies) >= largest);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
