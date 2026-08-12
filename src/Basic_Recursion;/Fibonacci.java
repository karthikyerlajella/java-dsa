package Basic_Recursion;

public class Fibonacci{
    static int Fibonacci(int n){
        if (n<=1)
            return n;

        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args){
        int n = 6;
        int result = Fibonacci(n);
        System.out.println("Fibonacci number = "+ result);
    }
}

/*
Leetcode : 509

class Solution {
    public int fib(int n) {
        if(n<=1)
          return n;

        return fib(n-1) + fib(n-2);
    }
}
 */