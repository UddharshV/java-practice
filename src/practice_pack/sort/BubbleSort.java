package practice_pack.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Original array before sorting operation: " + Arrays.toString(arr));
        int[] sortedArr = performBubbleSort(arr);
        System.out.println("Array after sorting operation: " + Arrays.toString(sortedArr));
    }

     static int[] performBubbleSort(int[] arr) {
        for(int i = 0; i <= arr.length-1; i++){
            int j = 1;
            boolean swap = false;
            while(j <= arr.length-i-1){
                if(arr[j-1] > arr[j]){
                    //swap greater element in the left with the smaller element to the right
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
                j++;
            }
            if(!swap)
                return arr;
        }
        return arr;
    }
}
