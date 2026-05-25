package p2_sorting;
import java.util.*;

//  TC: O(n^2) | SC: O(1)

public class InsertionSort {
    public static int[] insertionSort(int[] nums){

        int n = nums.length;
        for(int i=1; i<n; i++){
            int temp = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }

        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Before: " + Arrays.toString(nums));
        int[] result = insertionSort(nums);
        System.out.println("After: " +Arrays.toString(result));
    }
}
