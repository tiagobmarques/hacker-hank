package hacker.hank.introduction.endoffile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class JavaEndOfFile {
  @Test
  void solution() throws FileNotFoundException {
    Scanner in = new Scanner(new File("src/test/java/hacker/hank"
                                          + "/introduction/endoffile/JavaEndOfFile.txt"));

    int i = 0;
    while (in.hasNext()) {
      i ++;
      String t = in.nextLine();
      System.out.printf("%d %s\n", i, t);
    }

    in.close();
  }
}
