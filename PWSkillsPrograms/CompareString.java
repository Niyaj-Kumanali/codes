public class CompareString {
    public static void main(String[] args) {
        String strOne = "Hello";
        String strTwo = "Hello";
        boolean resultOne = strOne == strTwo ;
        System.out.println("By using == operator :"+ resultOne);
        boolean resultTwo = strOne.equals(strTwo) ;
        System.out.println("By using equals() method :"+ resultTwo);
    }
}
