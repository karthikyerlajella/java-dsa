package a_Foundations;

import java.util.Scanner;

public class DivisiorsofaNumber
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Divisior of "+ n + " are:");
        for (int i=1;i<=n;i++){
            if (n%i == 0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}


/*
striver problem
class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++){import java.util.*;

            class Solution {

                public int[] divisors(int n) {

                    ArrayList<Integer> list = new ArrayList<>();

                    for(int i = 1; i <= n; i++) {

                        if(n % i == 0) {
                            list.add(i);
                        }
                    }

                    int[] ans = new int[list.size()];

                    for(int i = 0; i < list.size(); i++) {
                        ans[i] = list.get(i);
                    }

                    return ans;
                }
            }
            if(n%i == 0){
                divisors.add(i);
            }
        }
        return divisors;
    }
}*/