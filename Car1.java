/*Design a program for managing different types of vehicles. Create interfaces 'Engine' and 'Features' with methods related to engine 
functionality and additional features. Implement a class 'Car' that extends 'Vehicle' and implements both interfaces.

Define interfaces 'Engine' and 'Features' with methods related to their respective functionalities.

-Create an abstract class 'Vehicle' with a parameterized constructor.

Implement a class 'Car' that extends 'Vehicle' and implements both Engine" and 'Features' interfaces.

- Access the superclass constructor from the 'Car' class. */

interface Engine{
    void combustion();
    void engineSpeed();
}
interface Features{
    void smokeRelease();
    void normalTemperature();
}

abstract class Vehicle implements Engine,Features{
    
    Vehicle(String name){
        combustion();
        engineSpeed();
        smokeRelease();
        normalTemperature();
    }

    public void combustion(){
        System.out.println("the combustion amount will be 80%");

    }
    public void engineSpeed(){
        System.out.println("the engine rotatory speed will be 20 rps");
    }
    public void smokeRelease(){
        System.out.println("the smoke release will be 20% , may increase after some years");
    }
    public void normalTemperature(){
        System.out.println("the normal temperature of the engine will be 27 degrees");
    }
}

public class Car1 extends Vehicle{
    
    Car1(String name){
        super(name);
    }

    public static void main(String args[]){
        Car1 c1 = new Car1("toyota");
    }


}
