package hacker.hank.introduction.loops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class JavaLoopsII {

  @Test
  void solution() throws FileNotFoundException {
    Scanner in = new Scanner(new File("src/test/java/hacker/hank"
                                          + "/introduction/loops/JavaLoopsII.txt"));
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();

      int s = a;
      for (int j = 0; j < n; j++) {
        s += Math.pow(2, j) * b;
        System.out.printf("%s ", s);
      }
      System.out.println("");
    }
    in.close();
  }
}
