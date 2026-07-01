class MethodEx {
    // public int addNumbers(int num1,int num2){
    //     return num1+num2;
    // }
    // public static int subNumbers(int num1,int num2){
    //     return num2-num1;
    // }
    // public static void one(){
    //     two();
    //     System.out.println("From method one");
    // }
    // public static void two(){
    //     three();
    //     System.out.println("From method two");
    // }
    // public static void three(){
    //     System.out.println("From method three");
    // }
    public static void change(int n){
        n=33;
    }
    public static void main(String[] args) {
        int a=10;
        change(a);//pass by value
        System.out.println(a);
        // one();
        // MethodEx obj=new MethodEx();
        // System.out.println(obj.addNumbers(11, 22));
        // System.out.println(subNumbers(11, 22));
    }
}
