// question asked in survey sparrow drive

public class wildcard_string {
    
    public boolean wildCard(String wilcard , String origin){
        String wildcard = "";
        for(int i=0;i<wilcard.length();i++){
            if(wilcard.charAt(i)!='*'){
                wildcard = wildcard+""+wilcard.charAt(i);
            }
        }
        if(wildcard.equals(origin)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        wildcard_string ws = new wildcard_string();
        String wildcard = "abc*d*e**f";
        String origin = "abcdef";
        System.out.println(ws.wildCard(wildcard, origin));

    }
}
