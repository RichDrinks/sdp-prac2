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
}
