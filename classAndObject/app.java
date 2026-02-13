public class app {
    
    public static void main(String[] args) {
        
        // //Default constructor

        // Student A = new Student();
        // A.id = 5;
        // A.age =19;
        // A.name = "rajiv";
        // A.nos = 5;        
        // System.out.println(A.id);
        // System.out.println(A.age);
        // System.out.println(A.name);
        // System.out.println(A.nos);

        // A.bunk();
        // A.sleep();
        // A.study();

       // Paramitraised constructo    
       Student A = new Student(1,20,"rahul",6);
        
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.name);
        System.out.println(A.nos);

        // A.bunk();
        // A.sleep();
        // A.study();

        // Copy constructor
    }
}
