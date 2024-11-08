package OOPS;
import java.util.LinkedList;
import java.util.Queue;
class QueueExample
{
	public static void main(String args [])
	{
		Queue<String> queue = new LinkedList<String>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		System.out.println("the front elelment is:"+queue.peek());
		queue.remove();
		queue.remove();
		System.out.println("the front element is:"+queue.peek());
		System.out.println("the queue size is:"+queue.size());
		if(queue.isEmpty())
		{
			System.out.println("the queue is empty");
		}
		else
		{
			System.out.println("the queue is not empty");
		}
	}
}