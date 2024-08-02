/*Problem Description :
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument 
‘r’ represents the number of rats present in an area, 
‘unit’ is the amount of food each rat consumes and 
each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:
Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
Example:

Input:
r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2

output : 4

*/
public class acc1 {

    public int ratEats(int r , int unit , int[] arr , int size){
        if(arr.length==0){
            return -1;
        }
        int sufficient=0;
        for(int i=0;i<arr.length;i++){
            sufficient = sufficient+arr[i];
            if(sufficient>=(r*unit)){
                return i+1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        acc1 rat_eat = new acc1();
        int[] arr1 = {2,8,3,5,7,4,1,2};
        int[] arr2 = {};
        System.out.println(rat_eat.ratEats(17, 2, arr1, 8));
        System.out.println(rat_eat.ratEats(7, 2, arr1, 8));
        System.out.println(rat_eat.ratEats(7, 2, arr2, 8));
    }
    
}
