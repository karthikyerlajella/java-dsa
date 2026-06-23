package a_Foundations;

import java.math.BigInteger;

public class GCDofTwoNumbers
{
    public static void main(String[] args)
    {
        int a=20;
        int b=30;
        BigInteger num1 = BigInteger.valueOf(a);
        BigInteger num2 = BigInteger.valueOf(b);
        BigInteger gcd=num1.gcd(num2);
        System.out.println("GCD of "+a+" and "+b+" are :"+ gcd);
    }
}

/**
class Solution {

    public static int GCD(int n1, int n2) {

        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return n1;
    }

    public static void main(String[] args) {

        int n1 = 12;
        int n2 = 15;

        System.out.println(GCD(n1, n2));
    }
}
**/