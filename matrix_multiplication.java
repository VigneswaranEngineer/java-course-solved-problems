public class matrix_multiplication {
    
    public static void main(String args[]){
        int arr1[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = new int[][]{{9,8,7},{6,5,4},{3,2,1}};
        int arr3[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr3[i][j] += arr1[i][k] *arr2[k][j];
                }
            }
        }

        for (int y=0;y<3;y++){
            for (int z=0;z<3;z++){
                System.out.println(arr3[y][z]);
            }
        }
}
}
