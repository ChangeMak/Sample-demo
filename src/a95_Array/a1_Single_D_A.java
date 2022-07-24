package a95_Array;

public class a1_Single_D_A {                    //Single Diamension array 

	public static void main(String[] args) {
		
		int []a= {10,20,30,40,50,60};
		
		System.out.println(a[2]);      //30
		System.out.println(a[3]);      //40
		System.out.println(a.length);  //6   
	   
	       
		for (int x=0;x<a.length;x++) {
			System.out.print(a[x]);     
			System.out.print(" ");        // 10 20 30 40 50 60 
		}
		
	}

}
