import java.io.*;
import java.util.*;

public class Permutations {

    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf) 
    {
        if(str.length()==0)
        {
            System.out.println(asf);
        }
        int n = str.length();
        
       for(int i=0;i<n;i++)
       {
           char ch = str.charAt(i);
           String lstr = str.substring(0,i);
           String rstr = str.substring(i+1);
           String s = lstr+rstr;
           printPermutations(s,asf+ch);
       }
    }

}
