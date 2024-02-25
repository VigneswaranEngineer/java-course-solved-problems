public class prac_fina {
    int a;
    final int b = 8;

    void getFinal(){
        System.out.println(a);
        System.out.println(b);
        //b = 5;
    }

    public static void main(String args[]){
        prac_fina f = new prac_fina();
        f.getFinal();
    }
}
