package Task_cls;

public class Count_UpperLower {

	public static void main(String[] args) {
		// find out the number of lower and upper case number 
		
		String a = "WeLcOme oT jAvA LectURE ";
		
		int lower=0;
		int upper=0;
		
		for (int i=0; i<a.length(); i++) {
			char ch = a.charAt(i);
			if (ch>'A' && ch<'Z') {                     //U ALSO USE A:65 Z:90 
				upper++;
			}
			else {
				lower++;
			}
		}
		System.out.println("Upper : "+upper);
		System.out.println("Lower : "+lower);
	}

}
