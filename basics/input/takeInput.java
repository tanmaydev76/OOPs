package input;
import java.util.Scanner;

public class takeInput {
    public static void main(String[] args) {
        // create a object of scanner class
          Scanner sc = new Scanner(System.in);
         
        // Take input 
          System.out.println("Enter the age : ");
          int age = sc.nextInt();
          
          System.out.println("enter the floating value: ");
          float radius = sc.nextFloat();

          System.out.println("enter byte ");
          byte num = sc.nextByte();
       
        // Print 
          System.out.println(age);
          System.out.println(radius);
          System.out.println(num);
         
        // Close the resources 
          sc.close();
    }
}
