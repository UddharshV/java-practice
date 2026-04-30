package practice_pack.TwoPointer_SlidingWindow;

public class TrappingRainWater {
    //https://leetcode.com/problems/trapping-rain-water/description/
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int vol = trapOptimizedSolution(height);
        System.out.println(vol);
    }

    public static int trapOptimizedSolution(int[] height) {
        int left=0, right = height.length-1, vol=0;
        int leftMax=0,rightMax=0;
        while(left<=right){
            leftMax=Math.max(leftMax, height[left]);
            rightMax=Math.max(rightMax, height[right]);
            if(leftMax<rightMax){
                vol+=leftMax-height[left];
                left++;
            }
            else{
                vol+=rightMax-height[right];
                right--;
            }
        }
        return vol;
    }

    public static int trapBetterSolution(int[] height) {
        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];
        int vol=0;
        for(int i=1; i<height.length; i++)
            leftMax[i]=Math.max(leftMax[i-1],height[i-1]);
        for(int i=height.length-2; i>=0; i--)
            rightMax[i]=Math.max(rightMax[i+1],height[i+1]);
        for(int i=0; i<height.length; i++)
            vol+=Math.max(0,Math.min(leftMax[i],rightMax[i])-height[i]);
        return vol;
    }

    public static int trapBF(int[] height) {
        int leftMax, rightMax, vol=0;
        for(int i=1; i<height.length-1; i++){
            leftMax=rightMax=height[i];
            for(int j=0; j<i;j++)
                leftMax=Math.max(leftMax,height[j]);
            for(int j=i; j<height.length; j++)
                rightMax=Math.max(rightMax,height[j]);
            vol+=Math.max(0,(Math.min(leftMax,rightMax)-height[i]));
        }
        return vol;
    }

}
