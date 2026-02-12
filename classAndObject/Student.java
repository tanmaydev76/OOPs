public class Student {
     // attributes
     public int id;
     public int age;
     public String name; 
     public int nos;
      
     // paramitarised Constructor// attr -> garbage  
     public Student(int id, int age, String name, int nos) {
        System.out.println("student default ctor called ");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
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
}
