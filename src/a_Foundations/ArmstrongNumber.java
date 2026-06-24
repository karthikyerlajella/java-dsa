package a_Foundations;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n = 153;
        int original = n;
        int sum = 0;

        while(n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }

        if(sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}

/**public class ArmstrongNumber {
    public static void main(String[] args) {

        int n = 1634;
        int original = n;

        int count = String.valueOf(n).length();

        int sum = 0;

        while(n > 0) {
            int rem = n % 10;
            sum += (int)Math.pow(rem, count);
            n /= 10;
        }

        if(sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
**/