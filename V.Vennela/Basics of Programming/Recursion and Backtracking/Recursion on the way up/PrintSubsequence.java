import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSS(str,"");

    }

    public static void printSS(String str, String ans) 
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return ;
        }
        
        char ch = str.charAt(0);
        String rem = str.substring(1);
        printSS(rem,ans+ch);
        printSS(rem,ans+"");
        
    }

}
