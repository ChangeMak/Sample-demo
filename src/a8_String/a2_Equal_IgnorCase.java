package a8_String;

public class a2_Equal_IgnorCase {

	public static void main(String[] args) {
		// EqualIgnoreCase
        
		String a="Hello";
		String b="Hello";
		
		System.out.println(a.equalsIgnoreCase(b));     //true
		
		
		String x="Hello";
		String y="Hey";
		
		System.out.println(x.equalsIgnoreCase(y));     //false

	}

}
