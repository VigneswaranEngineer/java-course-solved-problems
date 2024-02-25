// program worked with access modifiers

public class access_modifiers {
    protected int a = 5;
    String name = "java";

    private void getName(){
        System.out.println(name);
    }
    protected void getValue(){
        System.out.println(a);
    }

    public static void main(String args[]){
        main am = new main();
        am.getValue();
    }

}

class main extends access_modifiers{

    main(){
        // getname(); error due to private in method in class access modifier
        getValue(); // since child can use the protected method
    }
    
}


