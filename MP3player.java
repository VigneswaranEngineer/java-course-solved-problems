/*You are developing a music system with different audio devices. 
Implement an interface 'Playable with methods like 'play()' and stop()'. 
Implement classes for MP3Player and Radio implementing this interface.

- Design an interface 'Playable with play()' and 'stop() methods. 
-Implement classes for MP3Player and Radio, both implementing the "Playable interface.

- Demonstrate how interface methods are implemented in these classes. */

interface Playable {
    void play();
    void stop();
} 




public class MP3player implements Playable {
    
    public void play(){
        System.out.println("the music is playing in MP3 player");
    }

    public void stop(){
        System.out.println("the music is stopped in MP3 player");
    }

    public static void main(String[] args) {
        MP3player mp = new MP3player();
        mp.play();
        mp.stop();
        Radio r = new Radio();
        r.play();
        r.stop();
    }
}

class Radio implements Playable{

    public void play(){
        System.out.println("the music is playing in RADIO");
    }

    public void stop(){
        System.out.println("the music is stopped in RADIO");
    }
}
