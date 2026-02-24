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
       Student A = new Student(1,20,"rahul",6,"unknown");
        
        // System.out.println(A.id);
        // System.out.println(A.age);
        // System.out.println(A.name);
        // System.out.println(A.nos);
        //  System.out.println(A.gf);       // Private information 
        System.out.println(A.getName());   // Accesed private info using the get class method
 
         // Getter setter
        System.out.println(A.getAge());
        A.setAge(57);
        System.out.println(A.getAge());

        // decalred publically 
        // A.bunk();
        // A.sleep();
        // A.study();

        // declared in a private class
        //A.gfChatting();

        // If we want to access private info we can use by the get method
    }
}
