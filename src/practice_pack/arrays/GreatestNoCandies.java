package practice_pack.arrays;
import java.util.*;
public class GreatestNoCandies {
    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,extraCandies;
        System.out.println("Enter the number of kids");
        n = sc.nextInt();
        int[] candies = new int[n];
        System.out.println("Enter the number of candies each kid has one by one:");
        for(int i=0; i<n; i++)
            candies[i] = sc.nextInt();
        System.out.println("Enter the number of extraCandies that you have:");
        extraCandies = sc.nextInt();
        List <Boolean> result = myfunc(n, candies, extraCandies);
        System.out.println(result);
    }
    public static List<Boolean> myfunc(int n, int[] candies, int extraCandies){
        ArrayList<Boolean> result = new ArrayList<>(n);
        int[] totalCandies = new int[n];
        int max = 0;
        for(int i=0; i<n; i++) {
            totalCandies[i] = candies[i] + extraCandies;
            if (max < candies[i])
                max = candies[i];
        }
        for(int i=0; i<n;i++)
            if(totalCandies[i]>=max)
                result.add(true);
            else
                result.add(false);
        return result;
    }

}
