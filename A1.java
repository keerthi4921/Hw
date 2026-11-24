package Hw;
abstract class Vehicle{
    abstract void startEngine();
    void stopEngine(){
        System.err.println("Vehicle engine stopped");
    }
}
class Bike extends Vehicle{
    @Override 
    void startEngine(){
        System.out.println("Bike engine started using self-start");
    }
}

public class A1 {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.startEngine();
        b.stopEngine();
    }
    
}
