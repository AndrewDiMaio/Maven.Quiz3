package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
            String vowels = "aeiou";
            for (int i = 0; i<word.length(); i++){
                if (vowels.indexOf(Character.toLowerCase(word.charAt(i))) != -1) {
                    return true;
                }
            }return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String vowels = "aeiou";

        for (int i = 0; i<word.length(); i++){
            if (vowels.indexOf(Character.toLowerCase(word.charAt(i))) != -1) {
                return i;
            }
        }return -1;
    }


    public static Boolean startsWithVowel(String word) {
        String vowels = "aeiou";
        return vowels.indexOf(Character.toLowerCase(word.charAt(0))) != -1;
    }

    public static Boolean isVowel(Character character) {
        String vowels = "aeiou";
        return vowels.indexOf(Character.toLowerCase(character)) != -1;    }
}
