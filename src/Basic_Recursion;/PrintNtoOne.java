package Basic_Recursion;

import java.util.Scanner;

public class PrintNtoOne {

    static void PrintNtoOne(int n) {

        if (n == 0)
            return;

        System.out.print(n + " ");

        PrintNtoOne(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        PrintNtoOne(n);

        sc.close();
    }
}

/*
class Solution {
    public void printNumbers(int n) {
        // Your code goes here
        print(n);
    }
    public void print(int i){
        if(i == 0)
            return;
        System.out.println(i);

        print(i-1);
    }
}

 */