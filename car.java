public class car {
    float mileage;
    float distance;
    float petrol_consumed;
    static int car_purchased=0;

    car(float distance , float petrol_consumed ){
        this.distance = distance;
        this.petrol_consumed = petrol_consumed;
        getMileage();
        totalCars();
    }

    static void totalCars(){
        System.out.println("the total car purchased are :"+ ++car_purchased);

    }

    void getMileage(){
        mileage = distance/petrol_consumed;
        System.out.println("the mileage of the car is : "+mileage);
    }

    
    public static void main(String args[]){
        harrier c = new harrier(100, 2,"fas");
        PUNCH c1 = new PUNCH(100, 10, "pc1");
        
    }
} 

class TATA extends car{
    String model;
    TATA(float distance , float petrol_consumed,String model){
        super(distance , petrol_consumed);
        this.model = model;
    }


}

class PUNCH extends TATA{

    PUNCH(float distance , float petrol_consumed,String model){
        super(distance,petrol_consumed,model);
    }
}

class harrier extends PUNCH {

    harrier(float distance , float petrol_consumed,String model){
        super( distance , petrol_consumed, model);
    }
}
