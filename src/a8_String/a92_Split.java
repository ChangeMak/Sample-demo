package a8_String;

public class a92_Split {

	public static void main(String[] args) {
		//  Split
		
		String a="Are@You@Fine@Ajay";
		
		String[]b=a.split("@");
        
		String b1=b[0];
		String b2=b[1];
		String b3=b[2];
		String b4=b[3];
		//String b5=b[4];    ArrayIndex out of bounds exception
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}		
}