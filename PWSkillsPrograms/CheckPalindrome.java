public class CheckPalindrome {
    public static void isPalindrome(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        if(str.equals(reverse))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }
    public static void main(String[] args) {
        String str = "2552";
        isPalindrome(str);
    }
}
