package Task_cls;



public class Pattern {

	public static void main(String[] args) {
		
		
		for (int i=1;i<=4;i++) {                  //i for rows & j for column
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		 System.out.println("      ");
	  	for(int a=1;a<=4;a++) {
	  		for(int b=4;b>=a;b--) {
	  			System.out.print("*");
	  			
	  		}System.out.println(" ");
	  	}
}
	}