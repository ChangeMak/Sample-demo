package a98_Collection;

import java.util.ArrayList;
import java.util.List;

class a1_ArrayList {

	public static void main(String[] args) {
      List list=new ArrayList();                  //we can say it is syntax
      
      list.add(10);
      list.add("Welcome");
      list.add(2.15f);
      list.add('a');
      
      System.out.println(list);       // {10, Welcome, 2.15, a}
      
      System.out.println(list.get(2));   //2.15
      
      System.out.println(list.get(3));   //a
      
      System.out.println(list.size());   //by length it is 4
     
      
      for (int i=0; i<list.size(); i++) {
    	  System.out.print(list.get(i)+ ",");        // 10 Welcome 2.15 a
  
      }
     
	}

}
