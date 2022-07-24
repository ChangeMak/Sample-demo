package a8_String;

public class a9_Startend {

	public static void main(String[] args) {
		// endWith & startWith
		String a="Kapil";
		System.out.println(a.endsWith("il"));       //true
		System.out.println(a.startsWith("Ka"));     //true
		
		String b="Kapil";
		System.out.println(b.endsWith("iL"));       //false
		System.out.println(b.startsWith("ka"));     //false
		

		
	

}
}
