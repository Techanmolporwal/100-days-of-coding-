import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[][] data = new String[n][];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextLine().split(" ");
        }
        String[] temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i][2].compareTo(data[j][2]) < 0) {
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                } else if (data[i][2].compareTo(data[j][2]) == 0) {
                    if (data[i][1].compareTo(data[j][1]) > 0) {
                        temp = data[j];
                        data[j] = data[i];
                        data[i] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(data[i][1]);
        }

    }
}
