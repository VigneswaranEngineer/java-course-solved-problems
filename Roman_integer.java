import java.util.HashMap;

public class Roman_integer {
    public int romanToInt(String s) {
        int sum =0;
        HashMap<Character,Integer> h1 = new HashMap<>();
        h1.put('I',1);
        h1.put('V',5);
        h1.put('X',10);
        h1.put('L',50);
        h1.put('C',100);
        h1.put('D',500);
        h1.put('M',1000);
        for(int i=0;i<s.length();i++){
            if (i>0 && h1.get(s.charAt(i-1)) < h1.get(s.charAt(i))){
                sum = sum + h1.get(s.charAt(i)) - 2*h1.get(s.charAt(i-1));
            }
            else{
                sum = sum + h1.get(s.charAt(i));
                
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Roman_integer ri = new Roman_integer();
        int result = ri.romanToInt("VIII");
        System.out.println(result);
    }
}
