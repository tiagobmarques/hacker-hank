package hacker.hank.introduction.staticinitializerblock;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaStaticInitializerBlock {

  private static boolean flag;
  private static int B;
  private static int H;

  static {
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();

    if (B <= 0 || H <= 0) {
      flag = false;
      System.out.println("java.lang.Exception: Breadth and height must be "
                                + "positive");
    }else{
      flag = true;
    }
    sc.close();

  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }

  }//end of main

}//end of class