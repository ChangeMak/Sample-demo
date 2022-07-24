package a9_Inheritance;
//In single one parent have one child

class parent{                                    //1)create class
	public void m1() {                           //2)create method
		
		System.out.println("I am m1");		
	}	
}
public class single extends parent {  //3)use extends keyword with first class
	
	public void m2() {                          //4)create method
		System.out.println("I am m2");           
}
	
	public static void main(String[] args) {
		
            single s =new single();               //5)create object
           s.m1();
           s.m2();
	}

}
