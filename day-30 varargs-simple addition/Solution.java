import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add{
    public void add(int ...n){
        
        StringBuilder sb=new StringBuilder();
        
        int sum=0;
        for(int i:n){
            sum+=i;
             sb.append(i+"+");
              }
        
        sb=sb.deleteCharAt(sb.length()-1);
        
        System.out.println(sb.append("="+sum).toString());

    }
}

