import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        boolean isFound=false;
        for(int i:arr){
            if(i==target){
                System.out.println("Value found");
                isFound=true;
            }
        }
        if(!isFound){
            System.out.println("Value not found");
        }
    }
}
