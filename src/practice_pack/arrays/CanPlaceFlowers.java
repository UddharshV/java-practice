package practice_pack.arrays;
import java.util.Scanner;
public class CanPlaceFlowers {
    //https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of flowerbeds:");
        int n = sc.nextInt();
        int[] flowerbed = new int[n];
        System.out.println("Enter 0 (empty) or 1 (not empty) for each flowerbed:");
        for(int i=0; i<n; i++)
            flowerbed[i] = sc.nextInt();
        System.out.println("Enter the number of flowers that can be planted:");
        int x = sc.nextInt();
        boolean result = myfunc(flowerbed,x);
        System.out.println(result);
    }
    public static boolean myfunc(int[] flowerbed, int n){
        //case 1: starting two flowerbeds are empty or last two flowerbeds are empty
        /*case 2: middle:
            subcase 1:
            three consecutive empty flowerbeds - plant one in the middle


         */
        return false;
    }
}
