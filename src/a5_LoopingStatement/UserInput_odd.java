package a5_LoopingStatement;

import java.util.Scanner;

public class UserInput_odd {

	public static void main(String[] args) {
	
	    int n;
		System.out.println("Enter the no");
		Scanner o=new Scanner(System.in);
		int a=o.nextInt();
		
		do {
		if(a%2==1) {
			
			System.out.println(a); }
		  a=a+1;
		} while (a<=100);
		}
}