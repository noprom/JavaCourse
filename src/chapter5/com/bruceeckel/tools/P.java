//: com:bruceeckel:tools:P.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// The P.rint & P.rintln shorthand.
package chapter5.com.bruceeckel.tools;

public class P {
  public static void rint(String s) {
    System.out.print(s);
  }
  public static void rintln(String s) {
    System.out.println(s);
  }
  public static void rintln(int i) {
    System.out.println(i);
  }
} ///:~