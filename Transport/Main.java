package Transport;

public class Main {
   
    public static void main(String[] args) {
        // // Car  
        //  Car c = new Car("Maruti", "800", 4, 5, "Manual" );
        //  c.startEngine();
        //  c.startAc();  
        //  c.stopEngine(); 

        //  MotorCycle
        Motorcycle M = new Motorcycle("Hero", "splendor", 2,  "U", "Soft");
        M.startEngine();
        M.wheelie();
        M.stopEngine(); 
    }
}
