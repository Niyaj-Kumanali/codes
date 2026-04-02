package PWSkillsPrograms;

import java.util.Arrays;

public class checkAnagram {
    public static void anagram ( String str1, String str2 ) {
        char[] strOne = str1.toCharArray ();
        char[] strTwo = str2.toCharArray ();
        int[] arr = new int[ strOne.length ];
        Arrays.sort ( strOne );
        Arrays.sort ( strTwo );
        boolean flag = false;
        for ( int i = 0; i < strOne.length; i++ ) {
            if ( strOne[ i ] == strTwo[ i ] )
                arr[ i ]++;
            if ( arr[ i ] == 0 )
                flag = true;
        }
        if ( flag )
            System.out.println ( "These are not Anagrams" );
        else
            System.out.println ( "These are Anagrams" );
    }

    public static void main ( String[] args ) {
        String strOne = "abcd";
        String strTwo = "bcda";
        anagram ( strOne, strTwo );
    }
}
