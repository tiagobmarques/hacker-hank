package hacker.hank.introduction.loops;

import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class JavaLoopsI {

  private static final Scanner scanner = new Scanner("2");

  @Test
  void solution() {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    scanner.close();
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", N, i, N * i);
    }
  }
}
