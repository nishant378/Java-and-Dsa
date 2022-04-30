package queue;

import java.util.Stack;
class TwoStack
{
	 Stack<Integer> s1 =new Stack<Integer>();
     Stack<Integer> s2 =new Stack<Integer>();
     int x=0;
    void enqueue(int data)
    {
    	while(!s1.isEmpty())
    	{
    		s2.push(s1.pop());
    	}
    	
    	s1.push(data);
    	
    	while(!s2.isEmpty())
    	{
    		s1.push(s2.pop());
    	}
    }
    
    int  dequeue()
    {
    	if(!s1.isEmpty())
    	{
    		x=s1.peek();
    		s1.pop();
    		
    		
    }
    		 else 
    		 {
    			 System.out.println("Queue is full");
    
    		 }
    	return x;
    }
}

public class Problem1 {

	public static void main(String[] args) {
       TwoStack obj=new TwoStack();
       obj.enqueue(1);
       obj.enqueue(2);
       obj.enqueue(3);
    System.out.println("Peek:"+obj.s1.peek());
    	   System.out.println(obj.s1);
       System.out.println("Dequeue:"+obj.dequeue());
       System.out.println("Peek:"+obj.s1.peek());
       System.out.println(obj.s1);
    
	}

}
