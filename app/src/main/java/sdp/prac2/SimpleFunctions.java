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
    public List<Integer> Task6(List<Integer> listt) {
        List<Integer> arr=new ArrayList<Integer>();
        for (int i = 0; i < listt.size(); i++) {
            //System.out.println(listt.get(i));
            int val;
            val = listt.get(i);
            if (val ==100 || val==200 || val==300 || val==400 || val==500 || val==600 || val==700 || val==800 || val==900 || val==1000 ) {
                arr.add(val);
                
            }else {
                int ans;
                ans=Math.round(val / 100)*100;
                arr.add(ans);
                
            }
            i++;
        }
        return arr;
        //System.out.println(Arrays.toString(arr.toArray()));
        


    }


    }


}
