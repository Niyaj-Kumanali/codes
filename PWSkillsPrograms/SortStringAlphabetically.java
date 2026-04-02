package PWSkillsPrograms;

import java.util.Arrays;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        String str = "Niyaj";
        String result = sortStringAlphabetically(str);
        System.out.println("The string : " + str + "\nsorted as a: " + result);
    }

    private static String sortStringAlphabetically(String str) {
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String result = "";
        for (char c : charArray)
            result += c;
        return result;
    }
}
