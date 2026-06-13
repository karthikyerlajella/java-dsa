package b_Sorting;
import java.util.*;

//  TC: O(N*logN) | SC: O(1)

public class QuickSort {

    public static int partition(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low, j = high;

        while(i<j){
            while(nums[i]<=pivot && i<=high-1){
                i++;
            }
            while(nums[j]>=pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;

    }

    public static void quickSort(int[] nums, int low, int high){
        if(low<high){
            int pIndex = partition(nums, low, high);
            quickSort(nums,low,pIndex-1);
            quickSort(nums,pIndex+1,high);
        }
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
        quickSort(nums, 0,n-1);
        System.out.println("After: " +Arrays.toString(nums));

        sc.close();
    }
}
