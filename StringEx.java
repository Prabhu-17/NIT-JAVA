class StringEx {
    public static void main(String[] args) {
        String s=" Hello world java programming        ";
        
        System.out.println(s.trim());//trim the extra spaces at starting and ending
        for(char c:s.toCharArray()){//converts string into character Array
            System.out.print(c+" ");
        }
        String[] arr=s.split(" ");//converts into string array based on regex
        System.out.println(arr[2]);




        String a=new String("Hello world");
        System.out.println(s.equals(a));//check content
        System.out.println(s==a);//check reference
        System.out.println(s.substring(3,9));
        System.out.println(s.charAt(7));
        System.out.println(s.length());
    }    
}
