package a92_abst;

interface Bank{                           //method and field
	
	void ROI ();                         // by default consider public abstract
	public static final int a=10;        //by default consider as public static final 
	
}

   public class SBI implements Bank  {
	
	public void ROI() {
	 System.out.println("SBI ROI is 12.5%");
	}
   
	public static void main(String[] args) {
		
		Bank sbi = new SBI();
		sbi.ROI();

	}

}
