package a_Foundations;

public class PalindromeNumber {
    public static void main(String[] args) {

        int n = 121;
        int dup = n;
        int rev = 0;

        while(n>0){
            rev =  rev * 10 + n%10;
            n = n/10;
        }

        if(dup == rev) System.out.println(true);
        else System.out.println(false);

    }
}
