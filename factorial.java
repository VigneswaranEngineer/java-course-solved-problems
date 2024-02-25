
// factorial problem

public class factorial {
    static int ans=1                    ;

    void facto(int a){
        //int ans = 1;
        for (int i=a;i>0;i--){
            ans = ans * i;
        }
        System.out.println("the factorial is : "+ans);
    }


    static public void main(String args[]){
        factorial fac1 = new factorial();
        fac1.facto(5);
    }
}
