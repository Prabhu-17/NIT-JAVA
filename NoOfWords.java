class NoOfWords {
    public static void main(String[] args) {
        String s="Hello from java programming";
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());







        // System.out.println(arr.length);
        // int wordCount=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==32){//32-ascii value of space
        //         wordCount++;
        //     }
        // }
        // System.out.println(wordCount+1);
    }
}
