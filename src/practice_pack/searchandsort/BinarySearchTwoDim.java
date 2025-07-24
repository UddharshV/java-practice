package practice_pack.searchandsort;

import java.util.Arrays;

public class BinarySearchTwoDim {
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}};
        int target = 14;
        int[] index = searchTwoDim(arr,target);
        System.out.println(Arrays.toString(index));
    }
    static int[] searchTwoDim(int[][] arr, int target) {
        int row = 0, col = arr[0].length - 1;
        while(row <= arr.length-1 && col >= 0){
            if(arr[row][col] == target)
                return new int[] {row,col};
            else if(target < arr[row][col]){
                //ignore the elements below arr[row][col] as all elements in this column are sorted and greater than arr[row][col]
                col--;
            }
            else { //target > arr[row][col]
                //ignore the elements to the left side of arr[row][col] as all elements in this column are sorted and smaller than arr[row][col]
                row++;
                continue;
            }
        }
        return new int[] {-1,-1};
    }
}
