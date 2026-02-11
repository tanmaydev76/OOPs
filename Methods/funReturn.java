public class funReturn {

    // if we want to return any value use keyword static int funName

    // Single parameter
    static int myMethod(int x){
        // return valued function
        return 5 + x;
    }

    // 
    static int cal(int x, int y){
        return x + y;
    }

    // Method that doubles the number 
    static int doubleNumber(int x) {
        return x * 2;
    }
    public static void main(String[] args) {
        // single parameter passing 
        int fina = myMethod(39);
        System.out.println(fina);

        // multiple parameterr passing 
        System.out.println(cal(20, 30));

        // for loop double the number 
        for(int i=0; i<5; i++){
            System.out.println(doubleNumber(i));
        }
    }
}
