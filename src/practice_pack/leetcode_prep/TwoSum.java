package practice_pack.leetcode_prep;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        for(int i = 0; i < nums.length - 1; i++){
            int j = performOp(i,i+1, nums, target);
            if(i != j)
                System.out.println("[" + i + "," + j + "]");
        }
    }
    public static int performOp(int x, int n, int[] arr, int target){
        for(int i = n; i < arr.length; i++){
            if(arr[x] + arr[i] == target)
                return i;
        }
        return x;
    }
}
