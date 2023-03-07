import java.util.Arrays;
//https://www.codewars.com/kata/529eef7a9194e0cbc1000255/solutions/java
public class Anagram {
    public static void main(String[] args) {
        boolean bool = isAnagram("twoo", "woot");
        System.out.println(bool);
    }
    public static boolean isAnagram(String test, String original) {
        char[] charArray = test.toLowerCase().toCharArray();
        char[] charArray2 = original.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray2);
        return Arrays.toString(charArray).equals(Arrays.toString(charArray2));
    }
}
