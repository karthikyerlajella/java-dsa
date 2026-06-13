package b_Sorting;
import java.util.*;

//  TC: O(n^2) | SC: O(1)

public class RecursiveInsertionSort {
    public static void recursiveInsertion(int[] nums, int i, int n){

        if(i==n) return;

        int j=i;
        while(j>0 && nums[j-1]>nums[j]){
            int temp = nums[j - 1];
            nums[j - 1] = nums[j];
            nums[j] = temp;
            j--;
        }

        recursiveInsertion(nums, i+1, n);
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
        recursiveInsertion(nums,0,n);
        System.out.println("After: " +Arrays.toString(nums));

        sc.close();
    }
}
