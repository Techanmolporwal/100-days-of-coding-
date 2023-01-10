import java.math.BigDecimal;
import java.util.Scanner;

class Solution {
  public static void main(String[] args) {
    // Input
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }
    sc.close();

    // Write your code here
    int len = s.length;

    for (int i = 0; i < len - 1; ++i) {
      for (int j = 0; j < len - i - 1; ++j) {
        BigDecimal a = new BigDecimal(s[j + 1]);
        BigDecimal b = new BigDecimal(s[j]);

        if (a.compareTo(b) > 0) {
          String temp = s[j + 1];
          s[j + 1] = s[j];
          s[j] = temp;
        }
      }
    }
    // Output
    for (int i = 0; i < n; i++) {
      System.out.println(s[i]);
    }
  }
}
