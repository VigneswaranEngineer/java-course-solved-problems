
// this will print the indexes of the two number to get the target value


import java.util.Arrays;

public class twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
                else{
                    continue;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        twosum ts = new twosum();
        int[] arr = {1,2,3,4,5};

        int[] s = ts.twoSum(arr,7);
        System.out.println(Arrays.toString(s));
    }
}
