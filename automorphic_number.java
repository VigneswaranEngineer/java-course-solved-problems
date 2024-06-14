public class automorphic_number {


    public boolean isAutomorphic(int num){
        int square = num*num , fin =num;
        int count =0;
        while(num!=0){
            count++;
            num/=10;
        }
        int[] value = {10,100,1000,10000};
        if(square%value[count-1]==fin){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        automorphic_number an = new automorphic_number();
        System.out.println(an.isAutomorphic(6));
    }
}
