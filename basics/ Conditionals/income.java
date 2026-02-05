import java.util.Scanner;

public class income {
    
    public static void main(String[] args) {
        int income;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        income = sc.nextInt();

        // If statement 
        if (income > 100000) {
             System.out.println("You have good income");
        }
        
      sc.close();
    }
}
