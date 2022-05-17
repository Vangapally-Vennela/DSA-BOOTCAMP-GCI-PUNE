import java.io.*;
import java.util.*;

public class GetSubsequence{

    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> a = gss(str);
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

    public static ArrayList<String> gss(String str) 
    {
        if(str.length()==0)
        {
            ArrayList<String> a = new ArrayList<String>();
            a.add("");
            return a;
        }
          char ch = str.charAt(0);
            String sub = str.substring(1);
            ArrayList<String> obt = gss(sub);
            ArrayList<String> res = new ArrayList<String>();
             for (String val : obt) 
             {
                 res.add(""+val);                                       
             }
            for(String i  : obt)
            {
                res.add(ch+i);
            }
       
        return res;
    }

}
