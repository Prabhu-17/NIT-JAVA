import java.util.Scanner;

class WhileEx {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        //sum digits
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println(sum);

        //Count Digits
        // int count=0;
        // while(n>0){
        //     n/=10;
        //     count++;
        // }
        // System.out.println(count);
    }    
}
