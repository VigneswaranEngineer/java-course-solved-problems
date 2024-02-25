public class String_rotation {
    String str1;
    String str2;

    void stringRotate(String str1,String str2){

        if (str1.length()!=str2.length()){
            System.out.println("it is not a rotated value");
        }
        else{
            str1 = str1+str1;
            if (str1.indexOf(str2)!=-1){
                System.out.println(" yes it is rotated string ");
            }
            else{
                System.out.println("no , it is not a rotated string");
            }
        }

    }

    public static void main(String args[]){
        String_rotation sr1 = new String_rotation();
        sr1.stringRotate("vikki","klivi");
    }
    
}
