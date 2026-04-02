public class CheckUniqueCharactersInString {
    public static void isUnique(String str)
    {
        str = str.toLowerCase();
        boolean flag = false;
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i)))
                arr[str.charAt(i) - 'a']++;

        for (int i = 0; i < str.length(); i++)
            if(0 == arr[i] || arr[i] > 1) {
                flag = true;
                break;
            }

        if (flag)
            System.out.println("No");
        else
            System.out.println("Yes");
    }

    public static void main(String[] args) {
        isUnique("Abcdee");
        isUnique("Abcde");
    }
}
