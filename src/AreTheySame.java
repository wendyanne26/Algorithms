import java.util.Arrays;
//https://www.codewars.com/kata/550498447451fbbd7600041c/train/java
public class AreTheySame {
    public static void main(String[] args) {
    int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
    int[] b ={121, 14641, 20736, 361, 25921, 361, 20736, 361};
    boolean result = comp(a, b);
        System.out.println(result);
    }
    public static boolean comp(int[] a, int[] b) {
            if(a == null || b == null|| a.length != b.length){
                return false;
            }
            int[] newArr = new int[a.length];
            for(int i=0; i<a.length; i++){
                newArr[i] = a[i] * a[i];
            }
            Arrays.sort(newArr);
            Arrays.sort(b);

            for(int i=0; i<b.length; i++){
                if(newArr[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
    }

