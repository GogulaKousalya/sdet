package JavaActivity3;

import java.util.ArrayList;

public class ActivityS3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> myList=new ArrayList<String>();
myList.add("Mango");
myList.add("Banana");
myList.add("Apple");
myList.add(3,"Kiwi");
myList.add(1,"Orange");
System.out.println("Print all the fruits");
for(String s:myList)
{
	System.out.println(s);
}
System.out.println("3rd element in the list"+myList.get(2) ); 
System.out.println("Is mango in the list:" +myList.contains("mango"));
System.out.println("size of array list"+myList.size() ); 
myList.remove("Banana");
System.out.println("Newsize of array list"+myList.size() );
}
}


