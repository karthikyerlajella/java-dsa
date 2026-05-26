package p2_sorting;
import java.util.*;

//  TC: O(N*logN) | SC: O(N)

public class MergeSort {

    public static void merge(int[] nums, int low, int mid, int high){
        ArrayList<Integer> temp =  new ArrayList<>();
        int left = low;
        int  right = mid+1;

        while(left<=mid && right<=high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            nums[i] = temp.get(i-low);
        }
    }
    public static void mergeSort(int[] nums, int low, int high){
        if(low == high) return;

        int mid = (low+high)/2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid, high);
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

        int low = 0;
        int high = n-1;

        System.out.println("Before: " + Arrays.toString(nums));
        mergeSort(nums, low, high);
        System.out.println("After: " +Arrays.toString(nums));

        sc.close();
    }
}
