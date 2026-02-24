public class Student {
     // attributes
     public int id;
     private int age;
     public String name; 
     public int nos;
     private String gf;
      
     public String getName(){
        return this.name;
     }

     // Gettter setter method for accesig and updating private data members
     public int getAge(){
        return this.age;
     }

     public void setAge(int a) {
         this.age = a;
     }
     // paramitarised Constructor// attr -> garbage  
     public Student(int id, int age, String name, int nos, String gf) {
        System.out.println("student default ctor called ");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
     }

     // methods and behaviours
     public void study() {
           System.out.println(name + " is studying");
     }

     public void sleep() {
           System.out.println(name + " is sleeping  ");
     }

     public void bunk() {
           System.out.println(name + " is bunking");
     }

     private void gfChatting() {
           System.out.println("chatting with " + gf);
     }

     
}
