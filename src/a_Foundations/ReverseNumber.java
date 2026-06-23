package a_Foundations;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        int n=4589;
        int rem;
        int rev=0;
        while(n>0)
        {
            rem = n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        System.out.println(rev);
    }
}