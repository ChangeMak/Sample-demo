package a1_variable;

public class local_variable {
	
	public void m1() {
		
		int a=210;
		System.out.println(a);

	}
	
	
	public static void main(String[] args) {
		
		local_variable o=new local_variable();     //object creation 
		
		o.m1();
	}

}
