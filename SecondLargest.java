import java.util.*;
public class SecondLargest {
    public static void main(String args[]){
        int arr[]={1,2,43,54,54};
        System.out.println(getLargest(arr));
    }
    public static int getLargest(int[] arr){
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:arr){
            set.add(num);
        }
        if(set.size()<2){
            return -1;
        }
        set.remove(set.last());
        return set.last();
    }
    
}  // time and space is o(nlogn) and o(n)
/*class Solution:
    def getSecondLargest(self, arr):
        # Remove duplicates
        unique_arr = list(set(arr))
        
        if len(unique_arr) < 2:
            return -1  # or raise Exception("No second largest") if needed
        
        unique_arr.sort()
        return unique_arr[-2]
        */
/*public int getSecondLargest(int[] arr) {
    if (arr.length < 2) return -1;
    
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }

    return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
}
 */// time and space is o(n)