package a6_methods;

public class a1 {
	
	// 1) non static + non argument 
	
	public void m1() {
		
		System.out.println("hii tom");
		System.out.println("hii jerry");
	}
	
	// 2) argument method 
	
	public void m2 (int a) {
		
		System.out.println("jerry is my fev");
		}
    
	// 3)static method
	
	public void m3 (String b) {
		
		System.out.println("tom is my fev");
	}
	
	
	
	public static void main(String[] args) {
		
      a1 o =new a1();          //create object
      
      o.m1();                 //non static + non argument 
      
      o.m2(1);               //non static + argument 
      
      o.m3("abc");             //static +argument 
      
      
      
	}

}
