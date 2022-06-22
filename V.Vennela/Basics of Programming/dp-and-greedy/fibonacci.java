import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] extra = new int[n+1];
    System.out.println(fib(n,extra));
 }
 public static int fib(int n , int[] extra)
 {
    if(n==0 || n==1)
        return n;
    
    if(extra[n]!=0)
        return extra[n];
        
    int f1 = fib(n-1,extra);
    int f2 = fib(n-2,extra);
    
    extra[n]=f1+f2;
    
    return f1+f2;
 }

}
