package twopointer;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.validPalindrome("abcdbfa");
        System.out.println(result);
    }

    public boolean validPalindrome(String s){
        for (int i = 0, j = s.length() - 1; i < j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i - 1, j);
            }
        }

        return true;
    }

    public boolean isPalindrome(String s, int i, int j){
        while (i < j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }

        return true;
    }
}
