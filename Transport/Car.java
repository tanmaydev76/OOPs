package Transport;

public class Car extends Vehicle {
    
    public int noOfDoors;

    public String trnsmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String trnsmissionType){
        super(name, model, noOfTyres);      // It should be initialized first

        this.noOfDoors = noOfDoors;
        this.trnsmissionType = trnsmissionType;

        super.startEngine();
    }

    public void startAc(){
        System.out.println("AC started of "+ name); 
    }

}
