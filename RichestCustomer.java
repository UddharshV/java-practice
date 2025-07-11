package practice_pack.leetcode_prep;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] data = {
                {1,5},
                {7,3},
                {3,5}
        };
        int cumwealth = performOp(data);
        System.out.println("The richest customer wealth is: " + cumwealth);
    }
    static int performOp(int[][] data) {
//        int[] wealthamt = new int[data.length];
//        for(int i = 0; i < data.length; i++){
//            int sum = 0;
//            for(int amt : data[i])
//                sum += amt;
//            wealthamt[i] = sum;
//        }
//        int maxwealth = 0;
//        for(int cust_wealth : wealthamt)
//            if(cust_wealth > maxwealth)
//                maxwealth = cust_wealth;
//        return maxwealth;
        int maxwealth = 0;
        for (int[] datum : data) {
            int sum = 0;
            for (int amt : datum)
                sum += amt;
            if (sum > maxwealth)
                maxwealth = sum;
        }
        return maxwealth;
    }
}
