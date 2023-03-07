import java.util.Arrays;
//https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java
public class InvertValues {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(invert(array)));
    }
    public static int[] invert(int[] array) {
        int [] num = new int[array.length];
            for(int n = 0; n < array.length; n++){
                num[n] = array[n] * -1;
            }
            return num;
        }
    }
