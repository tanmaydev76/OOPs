package polymorphism;

public class Calculator {
    // Method Overloading  
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(int a, int b,double d){
        return a + b + d; 
    }

    // Operator overloading 
    // Java does not support user-defined operator overloading but internally overloads certain operators (e.g., + for) String concatenation and integer addition).


    // Runtime polymorphoism
     
}