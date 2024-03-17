public class palindrome_number {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        String s = String.valueOf(x);
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==rev.charAt(i)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        palindrome_number pn = new palindrome_number();
        boolean result = pn.isPalindrome(1001);
        System.out.println(result);
    }
}
