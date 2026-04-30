package practice_pack.TwoPointer_SlidingWindow;

public class ContainerWithMostWater {
    //https://leetcode.com/problems/container-with-most-water/description/
    public static void main(String[] args) {
        int[] height = {9,8,6,2,5,4,8,3,7};
        int maxVol = maxAreaBetter(height);
        System.out.println(maxVol);
    }

    public static int maxAreaBetter(int[] height) {
        int left=0, right=height.length-1;
        int vol=0, maxVol=0;
        while(left<right){
            vol=(right-left)*Math.min(height[left], height[right]);
            if(height[left]<height[right])
                left++;
            else
                right--;
            maxVol=Math.max(maxVol,vol);
        }
        return maxVol;
    }

    public static int maxAreaBF(int[] height) {
        int maxVol=0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                maxVol=Math.max(maxVol,((j-i)*Math.min(height[i], height[j])));
            }
        }
        return maxVol;
    }
}
