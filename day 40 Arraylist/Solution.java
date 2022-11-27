import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        
        while(n>0){
            int a = scan.nextInt();
            List<Integer> list1 = new ArrayList<>();
            for(int i=0;i<a;i++){
                list1.add(scan.nextInt());
            }
            arr.add(list1);
            n--;
        }
        
        int q= scan.nextInt();
        for(int i=0;i<q;i++){
            
            int x=scan.nextInt();
            int y=scan.nextInt();
            try{
             if(arr.get(x-1).get(y-1)!=null) 
             System.out.println(arr.get(x-1).get(y-1));   
            }
            
            catch(Exception e){
                System.out.println("ERROR!");
            }
          
        }
        scan.close();
    }
}
