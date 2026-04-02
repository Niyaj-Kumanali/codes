public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] arr= str.toCharArray();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(arr[i] == arr[j])
                {
                    arr[j] = ' ';
                }

            }
            if(arr[i] != ' ')
            {
                System.out.print(arr[i]);
            }
        }
    }
}
