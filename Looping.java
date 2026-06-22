import java.util.Scanner;

class Looping {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
       }


        // for(int i=10;i<=20;i+=2){
        //     if(i==16){
        //         break;
        //     }
        //     System.out.print(i+" ");
        // }
    }    
}
