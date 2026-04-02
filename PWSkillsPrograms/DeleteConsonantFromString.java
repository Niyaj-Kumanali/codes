public class DeleteConsonantFromString {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        String consonants = "([BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]+)";
        String result = str.replaceAll(consonants,"");
        System.out.println(result);
    }
}
