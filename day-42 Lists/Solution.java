import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int initialNumber = sc.nextInt();
    List<Integer> numbers = new ArrayList<>();
    for(int i = 0; i < initialNumber; i++){
        numbers.add(sc.nextInt());
    }
    int queries = sc.nextInt();
    for(int i = 0; i < queries; i++){
        String querie = sc.next();
        if(querie.equals("Insert")){
            numbers.add(sc.nextInt(), sc.nextInt());
        }
        else{
            numbers.remove(sc.nextInt());
        }
    }
    for (Integer integer : numbers) {
        System.out.print(integer + " ");
    }
    sc.close();

    }
}
