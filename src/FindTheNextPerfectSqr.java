//https://www.codewars.com/kata/56269eb78ad2e4ced1000013/train/java
public class FindTheNextPerfectSqr {
    public static void main(String[] args) {
        System.out.println(findSqr(144));
    }
    static long findSqr(long sq){
 //gets the square root of sq,floors it to the lowest value, casts it to a long because we are to return a long buh Math.sqrt() returns a double and then saves it in the long variable numSqr
        long numSqr = (long)Math.floor(Math.sqrt(sq));
//checks if numSqr * numSqr is not equal to sq and returns -1 else increment numSqr by 1 to get the next number; and then finally returns the square of numSqr.
        if(numSqr * numSqr != sq) {
            return -1;
        } else {
            numSqr++;
        }
        return numSqr*numSqr;
    }


}
