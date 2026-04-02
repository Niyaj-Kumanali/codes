package JspiderCodes.Programming;

public class AllPalindromeInString {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abdbabdba";
//        String str = "abxbyuykkhk";
//        String str = "niyaj";
//        String str = "madam";


        for (int i = 0; i < str.length() - 1; i++) {
            String temp = "" + str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                temp += str.charAt(j);
                if (isPalindrome(temp)) {
                    System.out.println(temp);
                }
            }
        }
    }
}
