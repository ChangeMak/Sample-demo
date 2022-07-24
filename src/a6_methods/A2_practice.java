package a6_methods;

public class A2_practice {
	
	
	public void m1 (int a, int b) {                  //create method
		
		int c=(a-b)*a;
		int d=(a/b)+a;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println("******");
		}

	public static void main(String[] args) {
		A2_practice abc=new A2_practice();                //create object 
		
		abc.m1(1220, 200);                                  //call that method 
		abc.m1(20, 440);
		abc.m1(40, 1210);
		abc.m1(61, 220);
		abc.m1(50, 150);
		abc.m1(40, 260);
	}

}
