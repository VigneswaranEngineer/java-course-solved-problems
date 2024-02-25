public class large_small {
    
    public static void main(String[] args){

        int[] arr = {2,6,1,3,9,11,5};

        for (int i=0;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j = j-1;
            }
        arr[j+1]=key;
        }
        
        
        int start = 0 , rear = (arr.length)-1;
         while(start<rear){
            System.out.println(arr[rear--]);
            System.out.println(arr[start++]);
         }

        
    }
}
