/*given an string you have to determine whether the string should be
converted to all uppercase or all lowercase , depending on the count of 
uppercase and lowercase letter in that string

example 1 : input : AbCdEfG , output = ABCDEFG
 
*/
import java.util.Scanner;


public class acc2 {

    public String checkCase(String check){
        int up = 0;
        int down = 0;
        for(int i=0;i<check.length();i++){
            if(check.charAt(i)<97){
                up++;
            }
            else{
                down++;
            }
        }
        if(up>down){
            return check.toUpperCase();
        }
        return check.toLowerCase();
    }
    public static void main(String[] args){
        acc2 cases = new acc2();
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(cases.checkCase(inp));
    }
}
