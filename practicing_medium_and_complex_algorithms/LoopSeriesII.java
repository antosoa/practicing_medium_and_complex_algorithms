package practicing_medium_and_complex_algorithms;

import java.util.*;
import java.io.*;

class LoopSeriesII{

    static List<Integer> createSerie(int a, int b, int n)
{
    List<Integer> res = new ArrayList<Integer>();
    for(int i=0; i<n; i++)
    {
        int j = i;
        double val = a + Math.pow(2,0)*b;
        while (j>0)
        {
         val+=Math.pow(2,j)*b;
         j--;
        }
    
        res.add((int)val);
    }
    return res;
}

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            List<Integer> subList = null;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            subList = createSerie(a,b,n);
            list.add(subList);
        }
        in.close();
  
    for(List<Integer> l : list)
    {
        for(Integer it : l)
        {
        System.out.print(it + " ");
        }
        System.out.print("\n");
    }
    }
}
