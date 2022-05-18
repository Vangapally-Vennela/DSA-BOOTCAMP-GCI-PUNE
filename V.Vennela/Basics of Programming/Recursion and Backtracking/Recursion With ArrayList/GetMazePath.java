import java.io.*;
import java.util.*;

public class GetMazePath{

    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> a = getMazePaths(0,0,n-1,m-1);
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

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) 
    {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> a =new ArrayList<String>();
            a.add("");
            return a;
        }
        ArrayList<String> res1 = new ArrayList<String>();
        ArrayList<String> res2 = new ArrayList<String>();
        if(sc<dc)
            res1 = getMazePaths(sr,sc+1,dr,dc);
        if(sr<dr)
            res2 = getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> res = new ArrayList<String>();
        for(String val : res1)
        {
            res.add("h"+val);
        }
        for(String val : res2)
        {
            res.add("v"+val);
        }
        return res;
    }

}
