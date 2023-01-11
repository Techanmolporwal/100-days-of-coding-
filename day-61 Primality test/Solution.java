import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        boolean result1;
        boolean result2;
        boolean result3;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
    BigInteger bigDecimal = new BigInteger(n);
    result1 = bigDecimal.isProbablePrime(1);
    result2 = bigDecimal.isProbablePrime(0);
    result3 = bigDecimal.isProbablePrime(-1);
    if(result1 && result2 && result3){
        System.out.println("prime");
    }else{
        System.out.println("not prime");
    }
     bufferedReader.close();  
    }
}
