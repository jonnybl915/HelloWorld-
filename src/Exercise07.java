import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by jonathandavidblack on 6/28/16.
 */
public class Exercise07 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isAPalindrome("dad"));
        System.out.println(isAPalindrome("blood"));
    }
    public static boolean isPalindrome(String input){
        String originalString = input;
        StringBuilder s = new StringBuilder(input);
        String reverseString = (s.reverse().toString());
        if (originalString.equals(reverseString)) {
            return true;

        }
        return false;
    }
    public static boolean isAPalindrome(String input) {
        String originalString = input;
        char[] chars = originalString.toCharArray();
        char[] reverseChars = new char[chars.length];
        //int numOfCharacters = chars.length;
        int n = chars.length - 1;
        for( char c: chars) {
            reverseChars[n] = c;
            n--;
        }
        String reverseString = String.valueOf(reverseChars);

        if (reverseString.equals(originalString)) {
            return true;
        }
        return false;
    }
}
