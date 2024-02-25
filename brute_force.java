// brute force method

public class brute_force {
    

    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,3,2,1,1};
        int arr1[] = new int[arr.length];

        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[j] = -1;
                }
            }
        }

        for(int k=0;k<arr.length;k++){
            if (arr[k]!=-1){
                arr1[k]=arr[k];
            System.out.println(arr[k]);
            }
        }
}
}
