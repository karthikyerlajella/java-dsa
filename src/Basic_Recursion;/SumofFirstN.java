package Basic_Recursion;

import java.util.Scanner;
public class SumofFirstN{
    static int SumofFirstN(int n){
        if (n==0) return 0;
        return n + SumofFirstN(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int ans = SumofFirstN(n);
        System.out.println("sum : "+ ans);
        sc.close();
    }
}

/*
class Solution {

    public int NnumbersSum(int N) {
        return print(N);
    }

    public int print(int i) {

        if (i == 0)
            return 0;

        return i + print(i - 1);
    }
}
 */