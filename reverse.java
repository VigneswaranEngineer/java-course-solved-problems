import java.lang.Math;
class reverse {

    long input = 123;
    long output;
    double size;

    void rever(){
        size = (Math.log(input)+1)/2;
        System.out.println((int)size);
        long first_number = input%10;
        long second_number = (input/10)%10;
        long third_number = (input/100)%10;
        long fourth_number = (input/1000)%10;
        
    }

    void join(){
        for (int i=0;i<4;i++){
            
        }
    }

    public static void main(String args[]){
        reverse rev = new reverse();
        rev.rever();
    }
    
}
