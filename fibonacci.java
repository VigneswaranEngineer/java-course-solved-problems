public class fibonacci {


    public void callFibonacci(int number){
        System.out.print("0 1");
        fibonacciSeries(0, 1 , number-2);
    }
    
    public int fibonacciSeries(int a, int b , int num){
        if (num==0){
            return 0;
        }
        int result = a+b;
        System.out.print(" "+result);
        return fibonacciSeries(b,result, num-1);
    }


    public static void main(String[] args) {
        fibonacci fib = new fibonacci();
        fib.callFibonacci(7);
    }
}
