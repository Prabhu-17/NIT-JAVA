class DuplicateChar {
    public static void main(String[] args) {
        String s="abccbdea";
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    count++;
            }
        }
        System.out.println(count);  





        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(s.charAt(i)==s.charAt(j)){
        //             System.out.println(s.charAt(i));
        //         }
        //     }
        // }
    }    
}
