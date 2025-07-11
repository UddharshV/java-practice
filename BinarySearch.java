package practice_pack.searchandsort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];
        System.out.println("Enter 10 numbers to perform binary search: ");
        for(int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        sortArr(arr);
        System.out.println("Enter the key to search within the given list of numbers: ");
        int key = sc.nextInt();
        int index = performBS(arr,key);
        displayResult(index, key, arr);
    }

    static void displayResult(int index, int key, int[] arr) {
        if(index == -1)
            System.out.println("The given key - " + key + " was not found within the sorted list of the given elements: " + Arrays.toString(arr));
        else
            System.out.println("The given key - " + key + " is in position - " + (index + 1) + " within the sorted list of given elements: " + Arrays.toString(arr));
    }

    static int performBS(int[] arr, int key) {
        int start = 0, end = arr.length - 1, mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] < key)
                start = mid + 1;
            if(arr[mid] > key)
                end = mid - 1;
        }
        return -1;
    }

    static void sortArr(int[] arr) {
        Arrays.sort(arr);
    }
}
