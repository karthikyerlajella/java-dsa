package a_Foundations;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        int n=121;
        int org=n;
        int rev=0;
        while(n>0)
        {
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        if(org == rev)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}


/**package a_Foundations;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // create Scanner object
        System.out.print("Enter a number: ");  // prompt user
        int n = sc.nextInt();                  // read integer input

        int org = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;          // extract last digit
            rev = rev * 10 + rem;      // build reversed number
            n = n / 10;                // remove last digit
        }

        if (org == rev) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close(); // close scanner
    }
}
**/