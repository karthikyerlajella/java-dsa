package p3_arrays.Easy;

public class LargestElement {

    public static int largestElement(int[] nums, int n){
        int max = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {3, 3, 0, 99, -40};
        int n = nums.length;

        int result = largestElement(nums,n);
        System.out.println(result);

    }
}
