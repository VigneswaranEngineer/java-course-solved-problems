/* implementation of two interf */




interface Android{
    final int seconds = 20;
    void makeCall();
    void sendMessage();
    void androidApps();
    void gMeet();

}

interface Iphone{
    final int seconds = 10;
    void makeCall();
    void sendMessage();
    void iphoneApps();
    void faceTime();

}

class Oneplus implements Android{

    public void makeCall(){
        System.out.println("your call is connecting in "+seconds + " seconds");
    }
    public void sendMessage(){
        System.out.println("the message is being sent...");
    }
    public void androidApps(){
        System.out.println("apps available in playstore");
    }
    public void gMeet(){
        System.out.println("Google meet is present...");
    }

}

class Samsung implements Android {
    public void makeCall(){
        System.out.println("your call is connecting in "+seconds + " seconds");
    }
    public void sendMessage(){
        System.out.println("the message is being sent...");
    }
    public void androidApps(){
        System.out.println("apps available in playstore");
    }
    public void gMeet(){
        System.out.println("Google meet is present...");
    }
}

class S12 implements Iphone{
    public void makeCall(){
        System.out.println("your call is connecting in "+seconds+" seconds" );
    }
    public void sendMessage(){
        System.out.println("the message is being sent...");
    }
    public void iphoneApps(){
        System.out.println("apps available in apple store");
    }
    public void faceTime(){
        System.out.println("facetime for meet is present...");
    }
}


class s14 implements Iphone{
    public void makeCall(){
        System.out.println("your call is connecting in "+seconds+"seconds");
    }
    public void sendMessage(){
        System.out.println("the message is being sent...");
    }
    public void iphoneApps(){
        System.out.println("apps available in apple store");
    }
    public void faceTime(){
        System.out.println("facetime for meet is present...");
    }
}





public class MyPhone implements Android,Iphone{

    public void sendMessage(){
        System.out.println("message can be sent ");
    }
    public void makeCall(){
        System.out.println("call can be made in "+Android.seconds+"seconds");
    }
    public void faceTime(){
        System.out.println("facetime is present ");
    }
    public void androidApps(){
        System.out.println("android apps are present");
    }
    public void iphoneApps(){
        System.out.println("particular apps of iphone is also present");
    }
    public void gMeet(){
        System.out.println(" Google meet can also be used as optional");
    }

    public static void main(String[] args) {
        MyPhone mp = new MyPhone();
        mp.androidApps();
        mp.faceTime();
        mp.makeCall();
        Samsung ss = new Samsung();
        //ss.faceTime();
    }

    
}
