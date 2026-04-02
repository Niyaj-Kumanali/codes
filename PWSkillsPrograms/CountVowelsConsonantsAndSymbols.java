public class CountVowelsConsonantsAndSymbols {
    public static void main(String[] args) {
        String str = "Hello World!";
        String consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        String vowels = "AEIOUaeiou";
        String notSpecialCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int countConsonants = 0, countVowels = 0, countSpecialCharacters = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < consonants.length(); j++) {
                if(str.charAt(i)==consonants.charAt(j))
                    countConsonants++;
            }
            for (int j = 0; j < vowels.length(); j++) {
                if(str.charAt(i)==vowels.charAt(j))
                    countVowels++;
            }
            if (!Character.isDigit(str.charAt(i))
                    && !Character.isLetter(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i)))
                countSpecialCharacters++;
        }
        System.out.println("Consonants : "+countConsonants);
        System.out.println("Vowels : "+countVowels);
        System.out.println("Special characters :"+countSpecialCharacters);
    }
}
