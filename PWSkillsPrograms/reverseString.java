package PWSkillsPrograms;

public class reverseString {
    public static void main(String[] args) {
        String str = "PWSKILLS";
        String result = reverse(str);
        System.out.println("The reverse of " + str + " is " + result);
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
