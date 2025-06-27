public class MoveAllZerosToEnd {
    public static void main(String args[]){
        int arr[]={1,0,0,0,6,7,8,9};
        moveZeros(arr);
        for(int n:arr){
            System.out.print(" "+n);
        }
        System.out.println();

    }
    public static  void moveZeros(int []arr){
        int index=0;
        for(int num:arr){
            if(num!=0){
                arr[index++]=num;
            }
            
        }
        while(index<arr.length){
              arr[index++]=0;
        }
        
    }
}
