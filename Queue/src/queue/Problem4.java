package queue;
import java.util.*;
class HalfQueue
{
	 Queue<Integer> queue1=new LinkedList<>();
	   Queue<Integer> queue2=new LinkedList<>();
   void halve(Queue<Integer> a)
   {
	  
	  int half1=a.size()/2;
	  int half2=a.size()-half1;
	  int i=1,j=1;
	  while(i<=half1)
	  {
		  queue1.add(a.remove());
		  i++;
	  }
	  while(j<=half2) 
	  {
		  queue2.add(a.remove());
		  j++;
	  }
	  interleaving(a);
   }
   
   void interleaving(Queue<Integer> a)
   {
	   int i=1,j=1;
	   int 	q1=queue1.size();
	   int q2=queue2.size();
	   while(i<=q1)
	   {
		   a.add(queue1.remove());
		   if(j<=q2)
		   {
			   a.add(queue2.remove());
			   j++;
		   }
		   i++;
	   }
	   
	   while(j<=q2)
	   {
		   a.add(queue2.remove());
		   j++;
	   }
   }
}
public class Problem4 {

	public static void main(String[] args) {
		
		HalfQueue obj=new HalfQueue();
		Queue <Integer> a= new LinkedList<>();
		a.add(11);
		a.add(12);
		a.add(13);
	    a.add(14);
	    a.add(15);
		a.add(16);
		a.add(17);
		 a.add(18);
			a.add(19);
			a.add(20);
		obj.halve(a); 
		System.out.println(a);

	}

}
