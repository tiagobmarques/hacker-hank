package hacker.hank.introduction.datatypes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class JavaDataTypes {

  @Test
  void main() throws FileNotFoundException {

    Scanner sc = new Scanner(new File("src/test/java/hacker/hank"
                                          + "/introduction/datatypes/JavaDataTypes.txt"));
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {

      try {
        long x = sc.nextLong();
        System.out.println(x + " can be fitted in:");
        if (x >= -128 && x <= 127) System.out.println("* byte");
        if (x >= -32768 && x <= 32767) System.out.println("* short");
        if (x >= Math.pow(-2,31) && x <= Math.pow(2,31)-1) System.out.println("* int");
        if (x >= Math.pow(-2,63) && x <= Math.pow(2,63)-1) System.out.println("* long");

        //Complete the code
      } catch (Exception e) {
        System.out.println(sc.next() + " can't be fitted anywhere.");
      }

    }
  }
}
