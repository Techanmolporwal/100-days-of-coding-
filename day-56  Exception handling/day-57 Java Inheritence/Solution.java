import java.io.*;
 import java.util.*;

public class Solution {

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Arithmetic ari = new Arithmetic();
    System.out.println("My superclass is: "+ari.getClass().getName());
    System.out.println(ari.sum(40,2)+ " " +ari.sum(10,3)+ " " +ari.sum(10,10));
}
} class Arithmetic{ public int sum(int a, int b){ return a+b; } }
