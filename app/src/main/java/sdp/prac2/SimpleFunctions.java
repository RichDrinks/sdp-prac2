package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public int Task1(List<Integer> a, List<Integer> b) //Added by Richard g20d3020
    {
        int sum = 0;
        for (Integer i : b)
            if(i < a.size() && i >=0 )
                sum += a.get(i);

        return sum;
    }

    public static boolean Task3 (String message) {

        int numLeftBracket = 0;
        int numRightBracket = 0;

        for (int i = 0; i < message.length(); i++) {

            if ( message.charAt(i) == '(' ) {
                numLeftBracket++;
                if ( message.charAt(i) == ')' ) numRightBracket++;
            }
        }

        if (numLeftBracket == 0 || numRightBracket == 0) return false;

        return numLeftBracket == numRightBracket;
    }

    public List<Integer> Task4(List<Integer> a, List<Integer> b) {
        int aLen = a.size();
        int bLen = b.size();
        int res;
        List<Integer> arr = new ArrayList<Integer>();
        if(aLen != bLen) {
            return null;
        }
        else {

            for (int i = 0; i < aLen; i++) {
                res = a.get(i) * b.get(bLen - i);
                arr.add(res);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // test methods

        System.out.println("SHould be false: " + Task3("msg (()"));
    }
}
