package polymorphism;

public class Main {
    
    public static void main(String[] args) {

        // // Method overloading calling
        // Calculator c = new Calculator();
        
        // System.out.println(c.add(5, 04));
        // System.out.println(c.add(2,30,40));
        // System.out.println(c.add(2, 3, 1.5));


        //runtime polymorphism
        //Upcasting
        Circle d= new Circle();
        d.draw();
        doDrawing(d);

        Rect r = new Rect();
        r.draw();
         
    }

    //Runtime  Polymorphic  or  Dynamic Method Dispatch
    public static void doDrawing(Shape s){
              s.draw();            
       
    }
}
