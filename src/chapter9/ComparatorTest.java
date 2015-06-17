//: c09:ComparatorTest.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// Implementing a Comparator for a class.
import com.bruceeckel.util.*;
import java.util.*;

class CompTypeComparator implements Comparator {
  public int compare(Object o1, Object o2) {
    int j1 = ((CompType)o1).j;
    int j2 = ((CompType)o2).j;
    return (j1 < j2 ? -1 : (j1 == j2 ? 0 : 1));
  }
}

class CompTypeComparator1 implements Comparator<CompType> {
	  public int compare(CompType o1, CompType o2) {
	    int j1 = o1.j;
	    int j2 = o2.j;
	    return (j1 < j2 ? -1 : (j1 == j2 ? 0 : 1));
	  }
}
           
public class ComparatorTest {
  public static void main(String[] args) {
    CompType[] a = new CompType[10];
    Arrays2.fill(a, CompType.generator());
    Arrays2.print("before sorting, a = ", a);
//    Arrays.sort(a, new CompTypeComparator());
//    Arrays.sort(a, new CompTypeComparator1());
    Arrays.sort(a, (o1, o2) -> {
    	int j1 = o1.j;
        int j2 = o2.j;
    	return (j1 < j2 ? -1 : (j1 == j2 ? 0 : 1));
    });
    Arrays2.print("after sorting, a = ", a);
  }
} ///:~