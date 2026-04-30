package practice_pack.TwoPointer_SlidingWindow;

public class MaxPointsFromCards {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1};
        int windowSize = 3;
        int maxPoints = getMaximumPointsFromKCards(arr, windowSize);
        System.out.println(maxPoints);
    }

    public static int getMaximumPointsFromKCards(int[] cardPoints, int k) {
        int leftPoints = 0, rightPoints = 0, maxPoints = 0, rightIndex = cardPoints.length-1;

        for (int i = 0; i <= k - 1; i++)
            leftPoints+=cardPoints[i];
        maxPoints = leftPoints;

        for (int i = k - 1; i >= 0; i--) {
            leftPoints-=cardPoints[i];
            rightPoints+=cardPoints[rightIndex];
            rightIndex--;

            maxPoints = Math.max(maxPoints, leftPoints+rightPoints);
        }
        return maxPoints;
    }


    public static int getMaximumPointsFromKCards2(int[] cardPoints, int k) {
        int start=0, end=k-1;
        int points=0, maxPoints=0;

        for(int i=start; i<=end;i++)
            points+=cardPoints[i];
        maxPoints=points;

        start=cardPoints.length-1;
        end=k-1;
        for(int i = 0; i < k; i++) {
            points -= cardPoints[end];
            end--;
            points += cardPoints[start];
            start--;
            maxPoints = Math.max(points, maxPoints);
        }
        return maxPoints;
    }
}
