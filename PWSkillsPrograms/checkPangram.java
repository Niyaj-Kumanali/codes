public class checkPangram {
    public static void pangram(String str)
    {

        str = str.toLowerCase();
        boolean flag = false;
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i)))
                arr[str.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++)
            if(0 == arr[i] || arr[i] > 1) {
                flag = true;
                break;
            }

        if (flag)
            System.out.println("These are not Pangrams");
        else
            System.out.println("These are Pangrams");

    }

    public static void main(String[] args) {
        String str = "Abcdefghijklmnopqrstuvwxyz";
        pangram(str);
    }
}
