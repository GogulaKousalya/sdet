package JavaActivity3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class ActivityS3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new LinkedList<String>();
		dq.add("Tiger");
		dq.add("Lion");
		dq.add("Chetah");
		dq.add("Dog");
		dq.add("cat");
		dq.add("pig");
		 System.out.println("The deque is: " + dq);
	      Iterator i = dq.iterator();
	      while (i.hasNext()) {
	         System.out.print(i.next() + " ");
	      }
	      
	  
	  System.out.println("     peek the element at head of the deque is: " + dq.peek());
	  System.out.println("     peek the element at tail of the deque is: " + dq.peekLast());
	  System.out.println("Does the deque contain element :" + dq.contains("wolf"));
	  dq.removeFirst();
      dq.removeLast();
      System.out.println("After removing the first and last elements is: " + dq);
}
}
