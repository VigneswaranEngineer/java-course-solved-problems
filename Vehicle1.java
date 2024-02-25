public class Vehicle1 {
    int speed;
    int fuel_capacity;
    float distance;
    int time_taken;

    Vehicle1(float distance , int time_taken){
        
        this.distance = distance;
        this.time_taken = time_taken;
    }

    void getSpeed(){
        speed = (int)distance/time_taken;
        System.out.println("the speed is "+speed);
    }
    void fuelCapacityCar(){
        System.out.println("the fuel capacity of car is 15 litres");
    }
    void fuelCapacitybicycle(){
        System.out.println("the fuel capacity of bicycle is 3 litres");
    }

    public static void main(String args[]){
        Vehicle1 v1 = new bicycle(50, 6);
        Vehicle1 v2 = new car(50, 2);
    }
}

class car extends Vehicle1{

    car(float distance , int time_taken){
        super(distance, time_taken);
        getSpeed();
        fuelCapacityCar();
    }
}

class bicycle extends Vehicle1{
    bicycle(float distance , int time_taken){
        super(distance, time_taken);
        getSpeed();
        fuelCapacitybicycle();
    }
}
