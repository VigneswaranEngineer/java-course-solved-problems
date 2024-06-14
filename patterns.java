public class patterns {
    
    public void stepsPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void invertedStepPattern(int num){
        for(int i=1;i<=num+1;i++){
            for(int j=num-i+1;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patterns pt = new patterns();
        pt.stepsPattern(5);
        pt.invertedStepPattern(5);
    }
}
