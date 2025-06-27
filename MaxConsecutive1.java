public class MaxConsecutive1 {
    public static void main(String args[]){
        int arr[]={0,0,0,0,0,1,1,1,1,1,1,1};
        System.out.println(getMaxOnes(arr));
    }
    public static int getMaxOnes(int [] arr)
{
    int maxCount=1,count=1;
    for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            count++;
        }else{
            maxCount=Math.max(maxCount,count);
            count=1;
        }
    }
    return Math.max(maxCount,count);
}}
