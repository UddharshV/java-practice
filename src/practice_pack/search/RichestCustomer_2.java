package practice_pack.search;
//https://leetcode.com/problems/richest-customer-wealth
public class RichestCustomer_2 {
    public static void main(String[] args) {
        int[][] data = {
                {1,2,3},
                {3,2,1}
        };
        int res = performOp(data);
        System.out.println("The richest customer wealth is: " + res);
    }
    static int performOp(int[][] data) {
        int[] sum = new int[data.length];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<data.length; i++) {
            sum[i]=0;
            for (int j = 0; j < data[i].length; j++) {
                sum[i]+=data[i][j];
            }
            if(sum[i]>max)
                max = sum[i];
        }
        return max;
    }
}
