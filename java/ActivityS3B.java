	package JavaActivity3;

import java.util.HashSet;
import java.util.Iterator;

public class ActivityS3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        set.add("six");
        System.out.println("An initial list of elements: "+set);  
        
	 set.remove("Two");
	 set.remove("nine");
	 System.out.println("Updated List: "+set);  
	 System.out.println("Is Two in the list:" +set.contains("Two"));
	 System.out.println("Updated List: "+set);
}



	}


