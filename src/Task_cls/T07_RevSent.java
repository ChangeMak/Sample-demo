package Task_cls;

public class T07_RevSent {

	public static void main(String[] args) {
	 
	String a[]	="I love you Viresh".split(" ");
	
	String b=" ";
	
	for(int i=a.length-1;i>=0;i--) {
		b+=a[i] + " ";
	}
		System.out.println(b);

	}

}
