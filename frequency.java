
// frequency problem in array

public class frequency {
    

    public static void main(String args[]){

        int arr[] = new int[]{1,2,3,2,1,2,3,4};
        
        int visited[] = new int[8];
        int i;
        for (i=0;i<visited.length;i++){
            visited[i]=0;
            //System.out.println(visited[i]);
        }

        for (int j=0;j<arr.length;j++){
            visited[arr[j]]++;
            //System.out.println(visited[j]);
        }

        for (int k=0;k<arr.length;k++){
            if (visited[k]>0){
                System.out.println("the number "+ k + " is repeated : "+ visited[k]+" times");
            }
            else{
                continue;
            }
            
        }

    }
}
