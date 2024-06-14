public class prime_number {


    public boolean isPrimeNumber(int number){
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public void prime_sequence(int number){
        for(int i=2;i<=number;i++){
            if(i==2||i==3){
                System.out.print(i + " ");
            }
            for(int j=2;j<i-1;j++){
                if(i%j==0){
                    break;
                }
                if(j==i/2){
                    System.out.print(i + " ");
                }
            }
            
        }
    }


    public static void main(String[] args) {
        prime_number pn = new prime_number();
        System.out.println(pn.isPrimeNumber(11));
        pn.prime_sequence(22);
    }
}
