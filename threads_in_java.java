
class for_loop extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("for loop");
        }
        
    }
}

class while_loop extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("while loop");
        }
        
    }
}

class Check_runnable implements Runnable{
    public void run(){
        System.out.println("IN RUNNABLE");
    }
}



public class threads_in_java {

    public static void main(String[] args) {
        for_loop fl = new for_loop();
        while_loop wl = new while_loop();
        wl.setPriority(10);
        fl.start();
        wl.start();
        Runnable r1 = new Check_runnable();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
