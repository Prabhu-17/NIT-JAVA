class ReverseWords {
    public static String reverseWord(String s){
        String[] arr=s.split(" ");
        int n=arr.length;
        StringBuilder sb=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(arr[i]+" ");
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWord(s));
    }
}
