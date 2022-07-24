package a9_Inheritance;    
//In multilevel one grandpa ,have one child,child have one child 
class parent2{
	public void prt2() {
		
	System.out.println("I am prt2");
	}
}

class parent1 extends parent2 {
	
	public void prt1() {
		System.out.println("I am prt1");
	}	
}
	
public class mlevel extends parent1 {

	public void chl1() {
		System.out.println("I am chl1");
	}
	public static void main(String[] args) {
		mlevel xyz =new mlevel();
		xyz.prt2();
        xyz.prt1();
        xyz.chl1();
	}
		
	}


