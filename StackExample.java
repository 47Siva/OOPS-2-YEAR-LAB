package OOPS;
import java.util.LinkedList;
import java.util.Stack;
class StackExample
{
	public static void main(String args [])
	{
		Stack<String> stack= new Stack <String>();
		stack.add("A");
		stack.add("B");
		stack.add("C");
		stack.add("D");
		System.out.println("the Stack size is"+stack.peek());
		stack.pop();
		stack.pop();
		System.out.println("the Stack size is"+stack.size());
		if (stack.isEmpty())
		{
			System.out.println("the stack is empty");
		}
		else
		{
			System.out.println("the stack is not empty");
		}
	}
}