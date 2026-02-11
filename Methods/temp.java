public class temp {

    static void myMethod(){
        System.out.println("I just got executed");
    }
   
    // Function creation
    static void welcomeMessage(String fname){
        System.out.println(fname + " Welcome to java");
    }

    // Passing multiple parameters 
    static void temp(String greet, int age){
        System.out.println(greet +" age is" + age);
    }

    static void checkAge(int age){
        // If else using function
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

           // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }
    public static void main(String[] args) {
        // calling myMethod
        myMethod();
        // Calling the function 
        welcomeMessage("Tanmay");

        temp("rajiv",20);
 
        checkAge(17); // Call the checkAge method and pass along an age of 20

        

    }
}
