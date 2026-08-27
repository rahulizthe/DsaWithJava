public class Recursion10 {
    public static boolean checkPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return checkPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "MADAM";
        boolean b1 = checkPalindrome(s1);
        
        if (b1 == true) {
            System.out.println("The String \"" + s1 + "\" is a Palindrome");
        } else {
            System.out.println("The String \"" + s1 + "\" is not a Palindrome");
        }
    }

}
