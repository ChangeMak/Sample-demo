package Task_cls;

import java.util.Scanner;

public class T03_UserPiramid {

	public static void main(String[] args) {
		// Print pyramid 

		System.out.println("Enter the number");
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		
		for (int b=1;b<=a;b++) {                   //a=1
			for(int c=a;c>=b;c--) {                //b=5
				
				System.out.print(" ");
			}
			for (int d=1;d<=b;d++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
