//: c13:Applet1d.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// Console runs applets from the command line.
// <applet code=Applet1d width=100 height=50>
// </applet>
package chapter13;

import chapter13.com.bruceeckel.swing.Console;

import javax.swing.*;

public class Applet1d extends JApplet {
  public void init() {
    getContentPane().add(new JLabel("Applet!"));
  }
  public static void main(String[] args) {
    Console.run(new Applet1d(), 100, 50);
  }
} ///:~