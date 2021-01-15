package JavaActivity3;

import java.util.LinkedList;
import java.util.Queue;
public class ActivityS3C {
   public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      System.out.println("The queue is: " + q);
      q.remove(5);
System.out.println("The element removed is: " + q);
 q.peek();

System.out.println("The size of the queue is: " + q.size());
}
}