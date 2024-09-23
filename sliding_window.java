public class sliding_window {
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int k = 3;
        int sum =0;
        for(int i=0;i<k;i++){
            sum += array[i];
        }
        int max = sum;
        for(int i=1;i<=array.length-3;i++){
            sum = sum-array[i-1]+array[i+(k-1)];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);

    }
}
