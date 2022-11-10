Java Iterator class can help you to iterate through every element in a collection. Here is a simple example:

import java.util.*;
public class Example{

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
In this problem you need to complete a method func. The method takes an ArrayList as input. 
In that ArrayList there is one or more integer numbers, then there is a special string "###", 
after that there are one or more other strings. A sample ArrayList may look like this:

output:Success
Input (stdin)

2 2
42
10
hello
java
Expected Output

hello
java
