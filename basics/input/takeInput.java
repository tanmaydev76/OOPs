package input;
import java.util.Scanner;

public class takeInput {
    public static void main(String[] args) {
        // create a object of scanner class
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your age :  ");

         int age = sc.nextInt();

         System.out.println("My age is " + age);
    }
}
