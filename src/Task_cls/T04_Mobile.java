package Task_cls;

import java.util.Scanner;

public class T04_Mobile {

	public static void main(String[] args) {
		// only accept Mobile number accept

	System.out.println("Enter the Number");
	Scanner sc =new Scanner(System.in);
	long a =sc.nextLong();
	
	long b = String.valueOf(a).length();   
	
	if(b==10) {
		System.out.println("+91"+a);
	}else{
		System.out.println("Mobile number is incorrect");
	}
}

}
