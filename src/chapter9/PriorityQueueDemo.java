package chapter9;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;


public class PriorityQueueDemo {

	/**
	 * @param args
	 */
	static void showQueue(Queue q){
		int queueSize = q.size();
		System.out.print("[");
		for (int i =0; i< queueSize; i++)
		{
		     System.out.print(q.poll()+",");
		}
		System.out.print("]");
	}
	
	static void fillQueue(Queue<Integer> q){
		Random rand = new Random(47);
		//Random(long seed) 
        //Creates a new random number generator using a single long seed.
		for(int i=0; i<10; i++)
			q.offer(rand.nextInt(i+10));
		//nextInt(int n) 
        //Returns a pseudorandom, uniformly distributed int value 
		//between 0 (inclusive) and the specified value (exclusive), 
		//drawn from this random number generator's sequence.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		fillQueue(queue);
		showQueue(queue);
		
		System.out.println("\n");
		
		Queue<Integer> priorityQueue = new PriorityQueue<Integer>();
		fillQueue(priorityQueue);
		showQueue(priorityQueue);
		
	}

}
