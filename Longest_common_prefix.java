public class Longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Longest_common_prefix lcp = new Longest_common_prefix();
        String[] arr = {"flower","flow","fludge"};
        String result = lcp.longestCommonPrefix(arr);
        System.out.println(result);
    }
}
