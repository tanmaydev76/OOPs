import java.util.Scanner;

public class  switchCase {
    public static void main(String[] args) {
         byte day;

         Scanner sc = new Scanner(System.in);
         System.out.println("Choose the days of week: ");
         day = sc.nextByte();

         switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wedneday");
                break;
            case 4:
                System.out.println("Thursday");
                break;    
            default:
                System.out.println("Invalid Input");
                break;
         }





    }
}
