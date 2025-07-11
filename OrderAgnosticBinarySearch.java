package practice_pack.searchandsort;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];
        System.out.println("Enter 10 numbers to perform binary search: ");
        for(int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        int order = checkSortOrder(arr);
        System.out.println("Enter the key to search within the given list of numbers: ");
        int key = sc.nextInt();
        int index = performBinarySearch(arr,key,order);
        displayResult(index, key, arr);
    }

    static void displayResult(int index, int key, int[] arr) {
        if(index == -1)
            System.out.println("The given key - " + key + " was not found within the sorted list of the given elements: " + Arrays.toString(arr));
        else
            System.out.println("The given key - " + key + " is in position - " + (index + 1) + " within the sorted list of given elements: " + Arrays.toString(arr));
    }

    static int performBinarySearch(int[] arr, int key, int order) {
        int index;
        if(order == 1){
            index = ascBinarySearch(arr,key);
            return index;
        }
        if(order == 2){
            index = descBinarySearch(arr,key);
            return index;
        }
        // return 0 if the first and last element are same as the list consists of only one unique element.
        return 0;
    }

    static int descBinarySearch(int[] arr, int key) {
        // List sorted in descending order
        int start = 0, end = arr.length - 1, mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] > key)
                start = mid + 1;
            if(arr[mid] < key)
                end = mid - 1;
        }
        return -1;
    }

    static int ascBinarySearch(int[] arr, int key) {
        // List sorted in ascending order
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

    static int checkSortOrder(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length - 1];
        if(first < last)
            return 1;
        if(first > last)
            return 2;
        return 3;
    }
}
