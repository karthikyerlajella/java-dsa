package Basic_Recursion;

public class ReverseanArray{
    public static void ReverseanArray(int[] arr)
    {
        int i=0;
        int j=arr.length -1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        ReverseanArray(arr);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}

/*
class Solution {
    public void reverse(int[] arr, int n) {
        int i = 0;
        int j = n -1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}


 */

