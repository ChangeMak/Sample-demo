package a93_Interface;

public class BANK implements SBI, BOI, HDFC  {
	
	public void sbi(String branch,String ifsccode) {
		System.out.println("Rate of interest of SBI bank is 12%");
		System.out.println("branch "+branch+"---IFSC Code="+ifsccode);
		System.out.println();
		}
	public void boi(String branch,String ifsccode) {
		System.out.println("Rate of interest of BOI bank is 12.56%");
		System.out.println("branch "+branch+"---IFSC Code="+ifsccode);
		System.out.println();
		}
	public void hdfc(String branch,String ifsccode) {
		System.out.println("Rate of interest of HDFC bank is 11.22%");
		System.out.println("branch "+branch+"---IFSC Code="+ifsccode);
		System.out.println();
		}
	
	public static void main(String[] args) {
		SBI o =new BANK();                              
		o.sbi("Pune","SBIN0018641");
		
		BOI o1=new BANK();
		o1.boi("Mumbai","SBIN00641");
		
		HDFC o2=new BANK();
		o2.hdfc("Mehkar","SBIN0018641");

	}

}
