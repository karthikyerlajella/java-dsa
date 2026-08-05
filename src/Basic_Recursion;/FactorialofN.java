package Basic_Recursion;

import java.util.Scanner;
public class FactorialofN{
    static int FactorialofN(int n){
        if (n<=0) return 1;
        return n * FactorialofN(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        int ans = FactorialofN(n);
        System.out.println("Factorial : "+ ans);
        sc.close();
    }
}

/*
class Solution {
    public int factorial(int n) {
        return print(n);
    }
    public int print(int i){
        if(i<=0) return 1;
        return i * print(i-1);
    }
}
 */