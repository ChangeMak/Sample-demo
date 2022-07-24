package a90_Polymorphism;

public class overldg {          //overloading by changing sequence of argument                     
	

		 public void sum(int a,long b)
		   {System.out.println(a+b);
		   }
		 public  void sum(int a,int b)
		  {System.out.println(a-b);
		  }

		  public static void main(String args[]){
			  overldg obj=new overldg();
		      obj.sum(100,20);             
}
}