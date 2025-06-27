import java.util.*;
public class ThreeGreatCandidates {
    public static void main(String args[]){
        int [] arr={1,-4,9,1,6,7,9};
        System.out.println(getThreeGreatCandidates(arr));
         ThreeGreatCandidates sol =new ThreeGreatCandidates();
          System.out.println(sol.getThreeGreatCandidates(new int[]{10, 3, 5, 6, 20}));        // ➜ 1200
        System.out.println(sol.getThreeGreatCandidates(new int[]{-10, -3, -5, -6, -20}));   // ➜ -90
        System.out.println(sol.getThreeGreatCandidates(new int[]{-10, -10, 5, 2})); 
    }
    public static  int getThreeGreatCandidates(int[] arr){
         if (arr == null || arr.length < 3) return 0;
        Arrays.sort(arr);
        int n=arr.length;
        int product1 = arr[0]*arr[1]*arr[n-1];
        int product2 = arr[n-1]*arr[n-2]*arr[n-3];
        return Math.max(product1,product2);
}
}

//O(n)
/* int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            // Update max values
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Update min values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Compare product of top 3 vs 2 smallest * largest
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}
 */