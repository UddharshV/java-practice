package practice_pack.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of the array as per the prompts display below: ");
        int[][] filledArr = getArrayElements(arr);
        System.out.println("The give multi-dimensional array is: ");
        displayArrayElements(filledArr);
    }
    static int[][] getArrayElements(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter # " + arr[i].length + " elements of row - " + (i+1) + ": ");
            for(int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        }
        return arr;
    }
    static void displayArrayElements(int[][] arr) {
        for(int[] a : arr)
            System.out.println(Arrays.toString(a));
        System.out.println();
    }
}
