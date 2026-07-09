package a_Foundatoions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n<=1){
            isPrime=false;
        }else {
            for (int i=2;i*i<=n;i++){
                if (n%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

        sc.close();
    }
}


/*
class Solution {
    public boolean isPrime(int n) {
        //your code goes here
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }else{
            for(int i=2;i*i <=n;i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            return true;
        }else{
            return false;
        }
    }
}
*/
