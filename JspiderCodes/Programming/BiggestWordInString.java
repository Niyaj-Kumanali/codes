package JspiderCodes.Programming;
//wap to print biggest words in string if two or more word having max length print first occurance
public class BiggestWordInString {
    public static void main(String[] args) {
//        String str = "Niyaj is a great boy";
        String str = "We students are awesome";
        String[] arr = str.split(" ");
        String max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(max.length() < arr[i].length()){ // use <= to take last occurance
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
