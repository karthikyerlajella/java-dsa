package Basic_Recursion;

import java.util.Scanner;

public class PrintOnetoN{
    static void PrintOnetoN(int i,int n){
        if (i>n) return;
        System.out.println(i);
        PrintOnetoN(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n value:");
        int n = sc.nextInt();
        PrintOnetoN(1,n);
        sc.close();
    }
}

/*
class Solution {
    public void printNumbers(int n) {
        // Your code goes here
        print(1,n);
    }
    public void print(int i,int n){
        if(i>n)
            return;
        System.out.println(i);

        print(i+1,n);
    }
}
*/
