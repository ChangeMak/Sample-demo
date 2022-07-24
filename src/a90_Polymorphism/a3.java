package a90_Polymorphism;
//same argument 
public class a3 {

	public void m1(String a) {
		System.out.println("I am m1");
	}
	
	public void m2(String b) {
		System.out.println("I am m2");
	}
	
	public static void main(String[] args) {
				
	   a3 o=new a3();
	   o.m1("Name");
       o.m2("NAMe");
	}

}
