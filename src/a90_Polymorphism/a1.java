package a90_Polymorphism;
                           //method overloading (argument different)
public class a1 {
    public void userName(String EmailId) { // 1 class int that no of mth but mth namesame  
    	
    	System.out.println("Email ID");
    }
	
	
	public void userName(int Mobileno) {
		
		System.out.println("MobileNo");
	}
	public static void main(String[] args) {
		a1 obj = new a1();       //object creation
		  
		obj.userName("k@gmail.com");
        obj.userName(123);
	}

}
