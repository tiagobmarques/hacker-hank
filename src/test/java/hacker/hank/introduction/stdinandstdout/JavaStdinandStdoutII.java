package hacker.hank.introduction.stdinandstdout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class JavaStdinandStdoutII {

  @Test
  void solution () throws FileNotFoundException {
    Scanner scan = new Scanner(new File("src/test/java/hacker/hank"
                                            + "/introduction/stdinandstdout/JavaStdinandStdoutII"
                                            + ".txt"));
    int i = scan.nextInt();
    double d = scan.nextDouble();
    String s = "";

    while (scan.hasNextLine()) {
      s += scan.nextLine();
    }

    System.out.println("String:-" + s);
    System.out.println("Double:-" + d);
    System.out.println("Int:-" + i);
  }
}
