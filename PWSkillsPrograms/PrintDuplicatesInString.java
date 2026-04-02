public class PrintDuplicatesInString {
    public static void main(String[] args) {
        String str = "Hello";
        char[] arr= str.toCharArray();
        int length = arr.length;
        String result = "";
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }

            }
        }
    }
}
