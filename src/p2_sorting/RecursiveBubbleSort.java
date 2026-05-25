package p2_sorting;
import java.util.*;

public class RecursiveBubbleSort {

    public static void recursiveBubbleSort(int[] nums, int n){

        if (n==1) return;

        for(int j=0; j<n-2; j++){
            if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }

            recursiveBubbleSort(nums, n-1);

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
        recursiveBubbleSort(nums, n);
        System.out.println("After: " +Arrays.toString(nums));

        sc.close();
    }
}
