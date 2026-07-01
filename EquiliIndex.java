public class EquiliIndex {
    public static void main(String[] args) {
        int[] arr={6,7,1,1,9,15};
        int n=arr.length;
        int total=0;
        for(int i:arr){
            total+=i;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            total-=arr[i];
            if(total==leftSum){
                System.out.println(i);
            }
            leftSum+=arr[i];
        }
        //bruteforce
        // for(int i=0;i<n;i++){
        //     int leftSum=0,rightSum=0;
        //     for(int j=0;j<i;j++){//leftsum
        //         leftSum+=arr[j];
        //     }
        //     for(int j=i+1;j<n;j++){//rightsum
        //         rightSum+=arr[j];
        //     }
        //     if(leftSum==rightSum){
        //         System.out.println(i);
        //     }
        // }
    }
}
