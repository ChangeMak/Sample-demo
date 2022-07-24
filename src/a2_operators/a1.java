package a2_operators;

public class a1 {
	
	public void m1(int x,int y) {
		
		int p=x+y;
		int q=x-y;
		int r=x*y;
		int s=x/y;
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
}

	public static void main(String[] args) {
		
		a1 o=new a1 ();
		
	  o.m1(10, 20);
	  o.m1(45,90);
      
	}

}
