package hacker.hank.introduction.outputformatting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class JavaOutputFormatting {

  @Test
  void solution () throws FileNotFoundException {
    Scanner sc=new Scanner(new File("src/test/java/hacker/hank"
                                        + "/introduction/outputformatting/JavaOutputFormatting"
                                        + ".txt"));
    System.out.println("================================");
    for(int i=0;i<3;i++)
    {
      String s1=sc.next();
      int x=sc.nextInt();
      System.out.printf("%-14s %03d \n", s1, x);
    }
    System.out.println("================================");
  }
}
