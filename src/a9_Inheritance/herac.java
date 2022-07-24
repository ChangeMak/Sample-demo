package a9_Inheritance;
//In the herarchi one parrent but he have 2 child

class prt1{
	public void p1() {
		System.out.println("I am parrent");
	}
}

class prt11 extends prt1{
	public void p11() {
		System.out.println("i am child 2");
	}
}


public class herac extends prt1 {
	public void h1() {
		System.out.println("I am child 1");
	}

	public static void main(String[] args) {
		herac o =new herac();
		o.p1();
		o.h1();
	
		System.out.println("***********");
		prt11 oo =new prt11();
		oo.p1();
		oo.p11();
		

	}

}
