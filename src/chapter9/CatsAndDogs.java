//: c09:CatsAndDogs.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// Simple container example.
package chapter9;
import java.util.*;

public class CatsAndDogs {
  public static void main(String[] args) {
   ArrayList cats = new ArrayList();
    for(int i = 0; i < 7; i++)
      cats.add(new Cat(i));
    // Not a problem to add a dog to cats:
    cats.add(new Dog(7));
    for(int i = 0, size = cats.size(); i < size; i++)
//    	((Cat)cats.get(i)).print(); // 这行会报错，应该像下面这样写
    	if(cats.get(i) instanceof Cat)
    		((Cat)cats.get(i)).print();
    	else
    		((Dog)cats.get(i)).print();
    // Dog is detected only at run-time

    
    ArrayList<Cat> cats_2 = new ArrayList<>();
    for(int i=0; i<7; i++)
    	cats_2.add(new Cat(i));
//    cats_2.add(new Dog(7));   // 报错
    for(Cat ci : cats_2)
    	ci.print();
    for(int i=0 ;i< cats_2.size();i++)
    	cats_2.get(i).print();
  }
} ///:~