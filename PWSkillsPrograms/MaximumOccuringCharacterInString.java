public class MaximumOccuringCharacterInString {
    public static void maxOccuranceCharIn(String str)
    {
        str = str.toLowerCase();
        int[] arr = new int[str.length()];
        boolean flag = false;
        for (int i = 0; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i)))
                arr[str.charAt(i) - 'a']++;

        for (int i = 0; i < str.length(); i++)
            if(0 == arr[i] || arr[i] > 1) {
                flag = true;
                break;
            }

        if (flag) {
            int max = 0;
            int ch = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                    ch = (char)i + 'a';
                }
            }
            System.out.println((char)ch + ":" + max);
        }
        else if(str == "")
            System.out.println("String is null");
        else
            System.out.println("All are same");
    }

    public static void main(String[] args) {
        maxOccuranceCharIn("abbbb");
    }
}
