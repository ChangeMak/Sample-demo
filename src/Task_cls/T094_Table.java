package Task_cls;

import java.util.Scanner;

public class T094_Table {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		
		for(int a=1; a<=10; a++) {
			System.out.println(num+"*"+a+"=" +num*a );
		}
		
		
		
		
	}
	
}
