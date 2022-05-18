import java.io.*;
import java.util.*;

public class GetStairPaths{

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> a = getStairPaths(n);
        System.out.print("[");
        for(int i=0;i<a.size();i++)
        {
            if(i==a.size()-1)
                System.out.print(a.get(i));
            else
                System.out.print(a.get(i)+", ");
        }
        System.out.print("]");
    }

    public static ArrayList<String> getStairPaths(int n) 
    {
        if(n==0)
        {
           ArrayList<String> x = new ArrayList<String> ();
           x.add("");
           return x;
        }
        if(n<0)
        {
            return new ArrayList<String>();
        }
        ArrayList<String> res1 = getStairPaths(n-1);
        char ch1 = 1+'0';
        ArrayList<String> res2 = getStairPaths(n-2);
        char ch2 = 2+'0';
        ArrayList<String> res3 = getStairPaths(n-3);
        char ch3 = 3+'0';
        ArrayList<String> res = new ArrayList<String>();
        for(String val : res1)
        {
            res.add(ch1+val);
        }
        for(String val : res2)
        {
            res.add(ch2+val);
        }
        for(String val : res3)
        {
            res.add(ch3+val);
        }
        return res;
    }

}
