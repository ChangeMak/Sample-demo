package Task_cls;

public class T06_Reverse_String {

	public static void main(String[] args) {
	 
		String a="Viresh";
		String b="";
		int l =a.length();
		
		for(int i=l-1;i>=0;i--) {
			
			b=b+a.charAt(i);
		}
		System.out.println(b);
	}
}
