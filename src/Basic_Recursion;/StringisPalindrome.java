package Basic_Recursion;

public class StringisPalindrome{
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length() -1;
        while (i<j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "MADAM";
        if (isPalindrome(s))
            System.out.println(s + " palindrome");
        else
            System.out.println(s + " Not palindrome");
    }
}

/*
class Solution {
    public boolean palindromeCheck(String s) {
        int i=0;
        int j=s.length() -1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
 */

/*
leetcode 125

class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            if (l != r) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
 */