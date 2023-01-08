import java.util.*;

public class Solution {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x,y;
   try {
    x=sc.nextInt();
    y=sc.nextInt(); 
    System.out.println(x/y);   
    }
    catch(InputMismatchException e)
    {
        System.out.print("java.util.InputMismatchException");
    }
   catch(Exception e)
   {
       System.out.println(e);
   }
   finally{
       sc.close();
   }
}
}
