import java.util. *;
public class AddMatrices{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the rows and coulums of mtarices");
        int m=sc.nextInt();
        int n= sc.nextInt();
        int first[][]= new int [m][n];
        int second[][]= new int [m][n];
        int sum[][]= new int [m][n];
        int dif[][] =new int[m][n];
        System.out.println("enter first elements");
        int c, d;
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                first[c][d]=sc.nextInt();
            }
        }
        System.out.println("Enter second elements");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                second[c][d]=sc.nextInt();
            }
        }
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                sum[c][d]=first[c][d]+second[c][d];
        }
    }
         for(c=0;c<m;c++){
            for(d=0;d<n;d++){
          dif[c][d] =first[c][d]-second[c][d];
            }
        }
        System.out.println("Sum of Matrices");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                System.out.print(sum[c][d]+"\t");

            }
            System.out.println();
        }
        System.out.println("Subtraction of matrices ");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                System.out.print(dif[c][d]+"\t");

            }
            System.out.println();
        }

    }
}
