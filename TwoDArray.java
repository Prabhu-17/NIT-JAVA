import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int j=0;j<arr[0].length;j++){
            int columnSum=0;
            for(int i=0;i<arr.length;i++){
                columnSum+=arr[i][j];
            }
            System.out.println(columnSum);
        }

        // Scanner in=new Scanner(System.in);
        // int n=in.nextInt();//row
        // int m=in.nextInt();//column
        // int[][] arr=new int[n][m];
        // //input
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         arr[i][j]=in.nextInt();
        //     }
        // }
        // //print
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
