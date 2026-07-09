package Recursion;

import java.util.Scanner;

public class PrintNameNtimes{
    static void PrintNameNtimes(String name,int i,int n){
        if (i>n) return;
        System.out.println(name);
        PrintNameNtimes(name,i+1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter you name:");
        String name = sc.nextLine();
        System.out.print("enter how many times to print:");
        int n = sc.nextInt();
        PrintNameNtimes(name,1,n);
        sc.close();
    }
}