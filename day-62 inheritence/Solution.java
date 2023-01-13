import java.io.*; 
import java.util.*;
 class Animal { 
     static void walk() { System.out.println("I am walking"); } 
     } 
     class Bird extends Animal {
          static void fly () { System.out.println("I am flying "); } static void sing() { System.out.println("I am singing"); }
           }

public class Solution {

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Bird.walk();
    Bird.fly();
    Bird.sing();

}
}
