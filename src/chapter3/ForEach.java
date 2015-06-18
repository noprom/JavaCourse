package chapter3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] strarr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", };
		
		System.out.print("strarr = {");
		for(int i=0; i<strarr.length; i++)
			System.out.print("\""+strarr[i]+"\", ");
		System.out.println("}");
		
		System.out.print("strarr = {");
		for(String str : strarr)
			System.out.print("\""+str+"\", ");
		System.out.println("}\n");
		
		List<String> lst = new ArrayList<String>();
		lst.add("One");
		lst.add("Two");
		lst.add("Three");
		lst.add("Four");
		
		System.out.print("ArrayList = {");
		Iterator it = lst.iterator();
		while(it.hasNext())
			System.out.print("\""+it.next()+"\", ");
		System.out.println("}");
		
		System.out.print("ArrayList = {");
		for(String str : lst)
			System.out.print("\""+str+"\", ");
		System.out.println("}\n");
		
	}

}
