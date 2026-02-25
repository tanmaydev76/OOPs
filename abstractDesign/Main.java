package abstractDesign;


abstract class Bird {
      
    abstract void fly();
    abstract void eat();
}

class Sparrow extends  Bird {
    @Override
    void fly(){
        System.out.println("Sparrow flying");
    }

    @Override 
    void eat() {
        System.out.println("sparrow eating");
    }
}

class Crow extends Bird {
    
    void fly() {
         System.out.println("Crow flying ");
    }

    void eat() {
         System.out.println("Crow eating");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.eat();
        b.fly();

        b = new Crow();
        b.fly();;
        b.eat();
    }
}
