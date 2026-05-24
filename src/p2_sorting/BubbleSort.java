package p2_sorting;
import java.util.*;

public class BubbleSort {

    public static int[] bubbleSort(int[] nums){
      return  new int[]{};
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

        int[] result = bubbleSort(nums);
        System.out.println("Before: " + Arrays.toString(nums));
        System.out.println("After: " +Arrays.toString(result));
    }
}
