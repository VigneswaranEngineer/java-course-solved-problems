
// problem on working with animals sound

public class animals {
    
    void makeSound(){
        System.out.println(" this is animal voice");
    }

    public static void main(String args[]){
        animals an1 = new animals();
        an1.makeSound();
        monkey mon1 = new monkey();
        mon1.makeSound();
        lion lion1 = new lion();
        lion1.makeSound();
    }
}

class monkey extends animals{
    void makeSound(){
        System.out.println("this is monkey sound");
    }
}

class lion extends animals{
    void makeSound(){
        System.out.println("this is lion sound");
    }
}
