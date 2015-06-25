package chapter11;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SimpleAndBetterRead {
	public static BufferedReader input = new BufferedReader(
			new StringReader("Sir Robin of Camelot\n22 1.61803"));
	
	public static BufferedReader input_2 = new BufferedReader(
			new InputStreamReader(System.in));
	
	public static String stmt = "I,am,very,happy!";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{

		System.out.println("What is your name?");
		String name = input.readLine();
		System.out.println("How old are you? What is your favorite double?");
		System.out.println("(input: <age> <double>)");
		String numbers = input.readLine();
		System.out.println(numbers);
		String[] numArray = numbers.split(" ");
		int age = Integer.parseInt(numArray[0]);
		double favorite = Double.parseDouble(numArray[1]);
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 years you will be %d.\n", age+5);
		System.out.format("My favorite double is %f.", favorite/2);
		
		System.out.println("\n\n");
		
		Scanner stdin = new Scanner(input_2);
		System.out.println("What is your name?");
		name = stdin.nextLine();
		System.out.println("How old are you? What is your favorite double?");
		System.out.println("(input: <age> <double>)");
		age = stdin.nextInt();
		favorite = stdin.nextDouble();
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 years you will be %d.\n", age+5);
		System.out.format("My favorite double is %f.", favorite/2);
		
		System.out.println("\n\n");
		
		StringTokenizer st = new StringTokenizer(stmt,",");
		while(st.hasMoreElements())
			System.out.print(st.nextToken()+" ");
		System.out.println("\n");
		
		
	}

}
