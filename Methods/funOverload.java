// Function overloadig concept 
public class funOverload {
    // function overlosding 
    static int plusMethod(int x, int y){
        System.out.println("method Int is called ");
        return x + y;
    }

    static double plusMethod(double x, double y){
        System.out.println("method double is called ");
        return x + y;
    }

    public static void main(String[] args) {
        // calling function with same name but with different datatypes
        int myNum1 = plusMethod(3, 04);
        System.out.println(myNum1);

        // Double function calling 
        double myNum2 = plusMethod(2.3, 6.87);
        System.out.println(myNum2);
    }
}
