// implementation of encapsulation 
public class Accounts {
    private int balance = 10000;
    private String username = "vigneswaran";
    private int password = 1234;

    void getBalance(String user){
        if (user == username){
            System.out.println("your balance is : "+balance);
        }
        else{
            System.out.println("Access denied");
        }
    }

    void withDraw(String userna , int passcode , int withdraw){
        if (userna == username){
            if (passcode == password){
                System.out.println("the amount withdrawed is : "+withdraw);
                int remain = balance-withdraw;
                System.out.println("the remaining balance is : "+remain);
            }
            else{
                System.out.println("the password is incorrect");
            }
        }
        else{
            System.out.println("wrong username");
        }
    }
}
