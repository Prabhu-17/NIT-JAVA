import java.util.Arrays;
import java.util.Scanner;

class ArrayEx {
    public static void main(String[] args) {
        int[] arr={33,44,11,8,1};
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }



    //     Scanner in=new Scanner(System.in);
    //     int[] arr=new int[5];
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=in.nextInt();
    //     } 
    //     int max=arr[0];
    //    for(int i=0;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //    }
    //    System.out.println(max);

    }
}
