package p2_sorting;
import java.util.*;

//  TC: O(n^2) | SC: O(1)

public class BubbleSort {

    public static void bubbleSort(int[] nums){

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for(int j=0; j<n-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = false;
                }
                if(flag) break;
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
        bubbleSort(nums);
        System.out.println("After: " +Arrays.toString(nums));

        sc.close();
    }
}
