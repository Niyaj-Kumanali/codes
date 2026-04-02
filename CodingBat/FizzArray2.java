package CodingBat;

public class FizzArray2 {
    public String[] fizzArray2(int n) {
        String[] str = new String[n];
        for(int i=0; i<str.length; i++){
            str[i] = ""+i;
        }
        return str;
    }

}
