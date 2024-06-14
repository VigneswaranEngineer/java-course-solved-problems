public class amstrong_number {
    

    public boolean isAmstrong(int num){
        int a=0 , result=0;
        int fin = num;
        while(num!=0){
            if(num<=9){
                a=num;
                num=0;
            }
            else{
                a= num%10;
                num= num/10;
            }
            result = result + (a*a*a);
        }
        if(fin==result){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        amstrong_number an = new amstrong_number();
        System.out.println(an.isAmstrong(1533));
    }
}
