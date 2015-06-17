//: c14:TestAccess.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// How threads can access other threads
// in a parent thread group.

public class TestAccess {
  public static void main(String[] args) {
    ThreadGroup 
      x = new ThreadGroup("x"),
      y = new ThreadGroup(x, "y"),
      z = new ThreadGroup(y, "z");
    Thread
      one = new TestThread1(x, "one"),
      two = new TestThread2(z, "two");
  }
}

class TestThread1 extends Thread {
  private int i;
  boolean stop=false;
  TestThread1(ThreadGroup g, String name) {
    super(g, name);
    start();  //make objects of TestThread1 run after being created.
  }
  void f() {
    i++; // modify this thread
    System.out.println(getName() + " f()");
  }
  public void run(){
    while(!stop){
    	try{
    	  sleep(100);
    	}
    	catch(InterruptedException e){
	}
    }
  }
}

class TestThread2 extends TestThread1 {
  TestThread2(ThreadGroup g, String name) {
    super(g, name);  //call the constructor of class TestThread1 
    		     //It would call start(), and start() would 
    		     //call TestThread2.run() (polymorphism in constructors)
  }
  public void run() {
    ThreadGroup g =
      getThreadGroup().getParent().getParent();
    g.list();
    Thread[] gAll = new Thread[g.activeCount()];
    g.enumerate(gAll);
    for(int i = 0; i < gAll.length; i++) {
      gAll[i].setPriority(Thread.MIN_PRIORITY);
      ((TestThread1)gAll[i]).f();
    }
    g.list();
    
    for(int i=0; i<gAll.length; i++)
      if((gAll[i].getName()).equals("one"))
      	((TestThread1)gAll[i]).stop=true;  // make Thread one stop too.
  }
} ///:~