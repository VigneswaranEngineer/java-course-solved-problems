public class index_of {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args){
        index_of io = new index_of();
        int result = io.strStr("hello", "lo");
        System.out.println(result);
    }
}
