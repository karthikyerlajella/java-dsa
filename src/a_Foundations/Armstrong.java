package a_Foundations;

public class Armstrong {
    public static void main(String[] args) {

        int n = 371;
        int dup = n;
        int sum = 0;
        int pow = (int) Math.log10(n)+1;

        while(n>0){
            int digit  = n%10;
            sum += Math.pow(digit,pow);
            n=n/10;

        }

        if(dup == sum) System.out.println(true);
        else System.out.println(false);
    }
}
