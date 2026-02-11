public class fact {
    
    static int factorial(int x){
        if(x > 0){
            return x * factorial(x - 1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
       System.out.println(factorial(3));
    }
}
