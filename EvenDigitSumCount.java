package practice_pack.leetcode_prep;

public class EvenDigitSumCount {
    public static void main(String[] args) {
        int num = 30;
        int count = performOp(num);
        System.out.println(count);
    }

    static int performOp(int num) {
        int count = 0;
        while(num > 0){
            int n = num, sum = 0;
            while(n > 0){
                int d = n % 10;
                sum += d;
                n = n/10;
            }
            if(sum %2 == 0)
                count++;
            num--;
        }
        return count;
    }
}
