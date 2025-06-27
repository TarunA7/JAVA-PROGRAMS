public class ThirdLargest {
    public static void main(String args[]){
        int[] arr={855 ,450 ,132 ,359 ,233 ,825 ,604 ,481 ,262 ,337 ,720 ,525 ,652 ,300 ,906 ,219 ,926, 906 ,293 ,864 ,817 ,498, 30 ,639 ,661};
        System.out.println(getThirdLargest(arr));

    }
    public static int getThirdLargest(int[] arr){
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
        for (int num:arr){
            if(num>first){
                third=second;
                second=first;
                first=num;
            }else if(num>second){
                third=second;
                second=num;
            }else if(num>third){
                third=num;
            }
        }
        return third;
    }
}
