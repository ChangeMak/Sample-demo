package a90_Polymorphism;
                              //overloading (sequence of argument )
public class a2 {
	public void a1(int c , String e) {
		System.out.println("hello");
		
	}

	public void a1(String d , int g) {
		
		System.out.println("hii");
	}
	public static void main(String[] args) {
		a2 o=new a2 ();
		o.a1(12,"hii");
		o.a1("abc",12);
		
	}

}
