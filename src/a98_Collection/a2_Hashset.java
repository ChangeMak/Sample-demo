package a98_Collection;

import java.util.HashSet;
import java.util.Set;

public class a2_Hashset {

	public static void main(String[] args) {
       
		Set list=new HashSet();
		
		  list.add(10);
	      list.add("Welcome");
	      list.add(2.15f);
	      list.add('a');
	      list.add(10);                    // dont get the duplicate value
		System.out.println(list);         // Display random list like that [a, 2.15, 10, Welcome]
		
		System.out.println(list.contains('a'));   //true
		System.out.println(list.isEmpty());       //false
		System.out.println(list.size());          // length is 4 
		

	}

}
