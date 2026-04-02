public class ReverseSentencePreservingPosition {
    public static void main(String[] args) {
        String sentence = "Think Twice";
        String result = reverseSentencePreservePositionOf(sentence);
        System.out.println("Reverse of : "+ sentence +" by preserving \nposition is: "+result);
    }

    public static String reverseSentencePreservePositionOf(String str) {
        String[] stringArray = str.split(" ");
        String result = "";
        for(String s : stringArray){
            for(int i = s.length()-1; i >= 0 ; i--) {
                result += s.charAt(i);
            }
            result += " ";
        }
        return result;
    }
}
