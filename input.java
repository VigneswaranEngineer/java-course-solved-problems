
// getting input from user

import java.util.Scanner;

class input{
    public static void main(String args[]){
        //input in1 = new input();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer :");
        int a = sc.nextInt();
        sc.nextLine();
        
        System.out.println("the input is : "+a);
        sc.close();
    }
}
