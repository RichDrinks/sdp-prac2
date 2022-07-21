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
    
    public static int[] task4(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        int res;
        if(aLen != bLen) {
            return null;
        }
        else {
            int[] arr = new int[aLen];
            for (int i = 0; i < aLen; i++) {
                res = a[i] * b[bLen - i];
                arr[i] = res;
            }
            return arr;
        }
    }
}
