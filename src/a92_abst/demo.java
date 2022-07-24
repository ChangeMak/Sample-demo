package a92_abst;

interface inter{
	    // java 8th version
	default void m1() {
		System.out.println("I am default method");
	}
	public static void m2 () {
		System.out.println("Static method");
	}
	   // java 9th version
	private void m3() {
		
		System.out.println("private method");
	}
}
    interface inter1{
    	
    	
    }
    
   public class demo implements inter,inter1 {


	public static void main(String[] args) {
		
		
		
		


	}

}
