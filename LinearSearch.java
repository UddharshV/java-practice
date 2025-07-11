package practice_pack.searchandsort;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements one by one: ");
        for(int i = 0; i<arr.length;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the element to be searched for: ");
        int key = sc.nextInt();
        int index = performLinearSearch(arr, key, 0, arr.length-1);
        System.out.println("The element - " + key + " was found at: " + index);
    }

    static int performLinearSearch(int[] arr, int ele, int start, int end) {
        if(arr.length == 0)
            return -1;
        if(start > end)
            return -1;
        for(int i = start; i <= end; i++){
            if(arr[i] == ele)
                return i+1;
        }
        return -1;
    }
}
