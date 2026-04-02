package JspiderCodes.Programming.TwoDArrays;

public class OccuranceOfEachCharacterMaintainingOrder {
    public static void main(String[] args) {
        String str = "hello hi bye";
        char[] arr1 = str.toCharArray();
        char[] arr2 = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                    arr2[j] = '\0';
                }
            }
            if (count > 0)
                System.out.println(str.charAt(i) + " : " + count);
        }
    }
}
