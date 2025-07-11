package practice_pack.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFuncTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<5;i++)
            arr[i] = sc.nextInt();
        System.out.println("Array before performing square operation: ");
        System.out.println(Arrays.toString(arr));
        squareOp(arr);
        System.out.println("Array after performing square operation: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void squareOp(int[] num){
        for(int i=0;i<num.length;i++){
            num[i] = (int) Math.pow(num[i],2);
        }
    }
}
