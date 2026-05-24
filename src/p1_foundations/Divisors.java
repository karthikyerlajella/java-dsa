package p1_foundations;

import java.util.ArrayList;

public class Divisors {
    public static void main(String[] args) {

        int n = 16;
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if(n%i == 0){
                divisors.add(i);
            }
        }
        System.out.println(divisors);
    }
}
