public class ConcatString {
    public static void main(String[] args) {
        String strOne = "Niyaj";
        String strTwo = "Kumanali";
        //By + opetator
        String resultOne = strOne + " " + strTwo;
        System.out.println("By + opetator : "+resultOne);
        //By concat() method
        String resultTwo = strOne.concat(" ").concat(strTwo);
        System.out.println("By concat() method : "+resultTwo);
    }
}
