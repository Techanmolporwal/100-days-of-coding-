import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
            Set<Integer> set = new HashSet<>();
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();

            int max=0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
                set.add(num);
                if(deque.size()==m){
                    if(set.size()>max)
                        max=set.size();
                    int x=(int)deque.removeFirst();
                    if(!deque.contains(x)){
                        set.remove(x);
                    }
                }
            }
            System.out.println(max);
    }
}
