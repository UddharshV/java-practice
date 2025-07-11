package practice_pack.basics;

import java.util.Arrays;

public class PassByValDemo {
    public static void main(String[] args) {
        int a = 10, b = 20;
        swapNums(a,b);
        System.out.println("a: " + a + " " + "b: " + b);
        int[] arr= {1,2,3,4,5};
        doubleList(arr);
        System.out.println("Array Elements: " + Arrays.toString(arr));
    }
    static void swapNums (int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    static void doubleList(int[] temp){
        for (int i=0;i<temp.length;i++)
            temp[i] *= 2;
    }
}
