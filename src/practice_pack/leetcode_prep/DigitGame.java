package practice_pack.leetcode_prep;
// https://leetcode.com/problems/find-if-digit-game-can-be-won/description/
public class DigitGame {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,10};
        boolean res = performOp(nums);
        System.out.println(res);
    }

    static boolean performOp(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int n : nums) {
            if(n <= 9)
                sum1 += n;
            else
                sum2 += n;
        }
        if(sum1 > sum2 || sum2 > sum1)
            return true;
        else
            return false;
    }
}
