package p2_sorting;
import java.util.*;

//  TC: O(n^2) | SC: O(1)

public class SelectionSort {
    public static void selectionSort(int[] nums){

        int n = nums.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                min = j;
            }
            if(min !=i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
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
        selectionSort(nums);
        System.out.println("After: " +Arrays.toString(nums));

        sc.close();
    }
}
