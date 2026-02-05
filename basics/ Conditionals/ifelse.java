import java.util.Scanner;

public class ifelse {
      
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("teen");
        }
        
        sc.close();
    }


    // Tip : get some knowledge about ternanry operator
}
