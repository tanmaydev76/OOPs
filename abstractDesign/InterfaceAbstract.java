package abstractDesign;

// Interface
interface Bird {

    void fly();

    void eat();
}


interface Walk {

    void Walking();

}

class Sparrow implements Bird,Walk {

    public void fly() {
        System.out.println("Sparrow flying");
    }

    public void eat() {
        System.out.println("Sparrow Eating");
    }

    public void Walk() {
        System.out.println("Sparrow Walking");
    }
}

class Crow implements Bird {
     
    public void fly() {
        System.out.println("Crow flying ");
    }

    public void eat() {
        System.out.println("Crow eating");
    }
    
}

public class InterfaceAbstract {
    
    public static void doBirdStuff(Bird b){
          b.eat();
          b.fly();
          if(b instanceof Walk){
            ((Walk)b).Walking();
          }
    }

    public static void main(String[] args) {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }

}


