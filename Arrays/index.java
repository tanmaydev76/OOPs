public class index {
    public static void main(String[] args) {
        // array declaration
        int arr[];

        // memory allocation
        arr = new int[10];

        // initilisation
        int marks[] = {100,20,39,40,50}; 

        System.out.println(marks.length);    // Lenght of an array

        // Accesing an element in the array
        System.out.println(marks[marks.length - 1]);
        System.out.println(marks[0]);

        // System.out.println("first element " + marks[0]);
        // System.out.println("first element " + marks[1]);
        // System.out.println("first element " + marks[2]);
        // System.out.println("first element " + marks[3]);
        // System.out.println("first element " + marks[4]);
        
        // Normal for loop
        System.out.println("Normal for loop");
        int n = marks.length;
        for(int i=0; i<n; i++){
            System.out.println(marks[i]);
        }

        // for each loop
        System.out.println("For each loop");
        for(int number : marks){
            System.out.println(number);
        }

    }
}
