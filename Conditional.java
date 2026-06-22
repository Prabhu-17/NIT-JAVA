class Conditional {
    public static void main(String[] args) {
        int i=4;
        if(i<5){
            System.out.println("Value less than 5");
            if(i<3){
                System.out.println("Value lesser than 3");
            }
        }
        else if(i<=10){
            System.out.println("Value less than 10");
        }
        else{
            System.out.println("Value greater than 10");
        }
        System.out.println("Outside if-else block");
    }
}
