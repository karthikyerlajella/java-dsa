package p3_arrays.Easy;

//  TC: O(N) | SC: O(1)

public class ArraySorted {

    public static boolean isSorted(int[] nums){

        for(int i=1; i<nums.length; i++){
            if(nums[i-1] > nums[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 40, 40};
        int n = nums.length;

        boolean result = isSorted(nums);
        System.out.println(result);
    }
}
