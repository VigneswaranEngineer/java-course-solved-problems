class palindrome {
    String word;
    String word2;

    void Palindrome(String word1){
        String rev = "";
        for (int i=word1.length()-1;i>=0;i--){
            rev = rev + word1.charAt(i);
        }
        
        if (word1.equals(rev)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }

    public static void main(String args[]){
        palindrome word = new palindrome();
        word.Palindrome("malayalam");
    
    }
}
