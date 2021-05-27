package hacker.hank.introduction.stdinandstdout;

import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class JavaStdinandStdoutI {

  @Test
  void solution (){
    String input = "42 100 125";
    Scanner scan = new Scanner(input);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
