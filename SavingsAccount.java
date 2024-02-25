/* Design a Java program representing a bank account using encapsulation. 
Include methods for deposit, withdrawal, and balance inquiry.
Create an interface Transaction' with methods like 'deposit()' and 'withdraw()'. 
Implement classes for SavingsAccount and CurrentAccount implementing this interface. 
-Create an interface Transaction' with 'deposit()" and "withdraw() methods.

-Implement classes for SavingsAccount and CurrentAccount, both implementing the 'Transaction' interface.. 
- Demonstrate dynamic polymorphism by invoking interface methods on different account objects. */

interface Transaction{
    void deposit(int a);
    void withdraw(int b);
    void balanceEnquiry();
}

class SavingsAccount implements Transaction{
    private int deposit_amount;
    private int withdrawal_amount;
    private int balance;

    public void balanceEnquiry(){
        balance = deposit_amount - withdrawal_amount;
        System.out.println("the balance : "+balance);
    }

    public void deposit(int amount){
        deposit_amount = amount;
        System.out.println("deposited amount :"+deposit_amount);
    }

    public void withdraw(int with_amount){
        withdrawal_amount = with_amount;
        System.out.println("withdrawal amount : "+withdrawal_amount);
    }

    public static void main(String[] args) {
        Transaction s1 = new SavingsAccount();
        s1.deposit(1000);
        s1.withdraw(200);
        s1.balanceEnquiry();
        s1 = new CurrentAccount();
        s1.deposit(2000);
        s1.withdraw(500);
        s1.balanceEnquiry();

    }
}

class CurrentAccount  implements Transaction{
    private int deposit_amount;
    private int withdrawal_amount;
    private int balance;

    public void balanceEnquiry(){
        balance = deposit_amount - withdrawal_amount;
        System.out.println("the balance : "+balance);
    }

    public void deposit(int amount){
        deposit_amount = amount;
        System.out.println("deposited amount :"+deposit_amount);
    }

    public void withdraw(int with_amount){
        withdrawal_amount = with_amount;
        System.out.println("withdrawal amount : "+withdrawal_amount);
    }
}




