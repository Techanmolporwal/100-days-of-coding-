import java.io.*;
import java.util.*;
import java.util.Scanner;

interface AdvancedArithmetic{
    public int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
   int result;
   @Override
    public int divisor_sum(int n){
        for (int i = 1; i <= n; i++) {
          if (n % i == 0)
             result =result + i;
        }
        return result;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
    int b = scan.nextInt();
    System.out.println("I implemented: AdvancedArithmetic");
    MyCalculator calc=new MyCalculator();
    System.out.println(calc.divisor_sum(b));

    }
}
