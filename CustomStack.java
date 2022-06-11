package customStack;

public class CustomStack {
	
	

	
	class Node{
		int val;
		int min;
		Node prev,next;
	}
	
	Node node;
	
	public CustomStack()
	{
			node=null;
	

	}
	
	public void push(int val)
	{
			
		if(node==null)
		{
			
			System.out.println("Empty stack, pushing in:"+val);
			node = new Node();
			node.val=val;
			node.min=val;
			return;
		}
		else
		{
		Node temp = node;
		System.out.print("current Node value:"+temp.val+" ");
		node.next= new Node();
		node = node.next;
		node.prev = temp;
		node.min = temp.min < val ? temp.min : val;
		node.val=val;
		System.out.println("After shifting, Previous node value:"+node.prev.val+" and current node value:"+node.val);
		node.next=null;
		}
	}
	
	public void pop()
	{
		if(node==null)
		{
			System.out.println("Empty stack!");
			return;
		}
		System.out.println("Popping out "+node.val);
		node = node.prev;
		
	}
	
	public int top()
	{
		
		return node.val;
	}
	
	public int getMin()
	{
		return node.min;
	}
	
	public static void main(String args[])
	{
		
		CustomStack stack = new CustomStack();

		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println("Minimum value of stack:"+stack.getMin());
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.push(10);
		System.out.println("Minimum value of stack:"+stack.getMin());
		stack.push(1);
		System.out.println("Minimum value of stack:"+stack.getMin());
		stack.pop();
		System.out.println("Minimum value of stack:"+stack.getMin());
	}
	
}
