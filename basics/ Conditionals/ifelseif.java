import java.util.Scanner;

public class ifelseif {
    
    public static void main(String[] args) {
        
        int marks;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks");
        marks = sc.nextInt();

        if (marks > 90) {
            System.out.println("Grade A");
        }
        else if(marks > 70) {
            System.out.println("Grade B");
        }
        else {
            System.out.println("Grade Low");
        }

        sc.close();
    }
}
