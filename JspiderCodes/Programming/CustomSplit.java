package JspiderCodes.Programming;

public class CustomSplit {
    public static String[] split(String str){
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        if(count == 0){
            return new String[]{str};
        }

        String[] arr = new String[count+1];
        String temp = "";
        int j=0;
//        str = str + " "
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                arr[j] = temp;
                j++;
                temp = "";
            }
            else {
                temp = temp + ch;
            }
        }
        arr[j] = temp;
        return arr;
    }

    public static void main(String[] args) {
        String str = "hello hi bye go goa gone";
        String[] res = split(str);
        for(String ele: res){
            System.out.println(ele);
        }
    }
}
