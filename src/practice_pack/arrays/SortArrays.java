package practice_pack.arrays;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        int[][] arr = {{3,4},{4,5},{1,2},{0,1}};
        for(int i=0; i<arr.length; i++)
            Arrays.sort(arr[i]);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
