//: c08:Parcel6.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// A method that returns an anonymous inner class.
package chapter8;
public class Parcel6 {
  public Contents cont() {
    return new Contents() {
      private int i = 11;
      public int value() { return i; }
    }; // Semicolon required in this case
  }
  
  public Contents cont_lambda(){
	  return () -> {
		  int i = 11;
		  return i;
	  } ;
  }
  
  public static void main(String[] args) {
    Parcel6 p = new Parcel6();
    Contents c = p.cont();
    c = p.cont_lambda();
    Contents c1 = () -> {return 11;};
    System.out.println(c1.value());
  }
} ///:~