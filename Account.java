
// bank account management program

public class Account {
    static int count = 0;
    int balance;
    public void setBalance(int balance) {
        this.balance = balance;
    }
    void increment(int cnt){
            cnt = count++;
            System.out.println("no of transactions done by users in the bank : "+count);
    }
    public void credit(int money){
        if (money>100000){
            System.out.println(" this much of money cannot be credited ");
        }
        else{
            if (money<0){
                System.out.println("CREDIT AMOUNT SHOULD NOT BE NEGATIVE");
            }
            else{
            System.out.println("the credit amount is : "+money);
            int balance = this.balance + money;
            System.out.println("your balance is : "+balance);
            setBalance(balance);
            }
        }
    }
    public void debit(int money){
        if (balance<money){
            System.out.println("shortage of amount ");
        }
        else{
            if (money<0){
                System.out.println("NO NEGATIVE WITHDRAW");
            }
            else{
            System.out.println("the debit amount is : "+money);
            int balance = this.balance - money;
            setBalance(balance);
            }
        }
    }
    public void checkbalance(){
        System.out.println("the balance is : "+balance);
    }
    public static void main(String arge[]){
        System.out.println("Account 1");
        Account acc1 = new Account();
        acc1.balance=1000;
        acc1.checkbalance();
        acc1.credit(100);
        acc1.increment(count);
        acc1.debit(200);
        acc1.increment(count);
        acc1.checkbalance();
        System.out.println("\n");
        System.out.println("Account 2 ");
        Account acc2 = new Account();
        acc2.balance=1000;
        acc2.checkbalance();;
        acc2.credit(200);
        acc2.increment(count);
        acc2.debit(300);
        acc2.increment(count);
        acc2.checkbalance();
    }
}   
