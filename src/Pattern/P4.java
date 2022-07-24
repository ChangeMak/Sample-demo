package Pattern;

public class P4 {

	public static void main(String[] args) {
		/*
		  *
		   *
		    *
		*
		 *
		  *
		   *
		    */
		
		System.out.println("*");
		System.out.println(" *");
		System.out.println("  *");
		System.out.println("   *");
		 
		System.out.println("    *");
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(" ");
				
			}
			System.out.println("*");	
		}
		
	}

}
