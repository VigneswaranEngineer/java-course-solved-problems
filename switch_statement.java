public class switch_statement {


    public String findGender(char ch){
        switch(ch){
            case ('m'):
                return "You are male ";
            case ('f'):
                return "You are female";
            default:
                return "please enter correct gender";
        }
    }






    public static void main(String[] args) {
        switch_statement swit = new switch_statement();
        String result = swit.findGender('m');
        System.out.println(result);

    }
}
