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
}
