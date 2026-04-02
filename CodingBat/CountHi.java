package CodingBat;

public class CountHi {
    public int countHi(String str) {
        int count = 0;
        for(int i=0; i<str.length()-1; i++){
            String s = ""+str.charAt(i)+str.charAt(i+1);
            if(s.equals("hi")){
                count++;
            }
        }
        return count;
    }

}
