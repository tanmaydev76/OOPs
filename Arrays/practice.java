import java.util.Scanner;

public class practice {

     int arr[] = {2,3,4,10,6};
    public static void main(String[] args) {
        
        // taking input in an array's
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        size = sc.nextInt();

        int arr[] = new int[size];

        // Taking input in an array
        for(int i=0; i<size; i++){
            System.out.println("Enter the value of index" + i);
            arr[i] = sc.nextInt();
        }
        
        // Printing elements in an array
        System.out.println("the elements in an array are : ");
        for(int j=0; j<size; j++){
            System.out.println(arr[j]);
        }

        // Que 1 : find sum of all values in an array
        int sum = 0;
        for(int i=0; i<size; i++){
             sum = sum + arr[i];
        }
        System.out.println("Sum is " + sum);

        // Que 2 : find mul of array
        int mul = 1;
        for(int i=0; i<size; i++){
              mul = mul * arr[i];
        }
        System.out.println("mul is: " + mul);

        // Max element in an array
        int max = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max is: " + max);

        // Min element in an array
        int Min = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i] < Min){
                Min = arr[i];
            }
        }
        System.out.println("min element is " + Min);
        sc.close();
    }
}
