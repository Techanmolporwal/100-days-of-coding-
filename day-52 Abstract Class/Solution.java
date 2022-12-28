import java.io.*;
import java.util.*;
import java.util.Scanner;
abstract class Book{
    String title;
   abstract void setTitle(String s);
   String getTitle()
   {
      return title;
   }
}
class MyBook extends Book{
    @Override
    void setTitle(String s){
        this.title = s;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        MyBook bk=new MyBook();
        Scanner sc=new Scanner(System.in);
        String ne=sc.nextLine();
        bk.setTitle(ne);
        System.out.println("The title is: "+bk.getTitle());
         
    }
}
