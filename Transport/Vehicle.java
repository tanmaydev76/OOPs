package Transport;

public class Vehicle {
     protected  String name ;
     public String model;
     public int noOfTyres;

     Vehicle(){
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
     }
      
     Vehicle(String model, String name, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
     }

      

     void startEngine(){
        System.out.printf("Engine is starting of %s : %s \n", name, model);
     }

     void stopEngine(){
        System.out.printf("Engine is stopping of %s : %s\n", name, model);
     }

}
