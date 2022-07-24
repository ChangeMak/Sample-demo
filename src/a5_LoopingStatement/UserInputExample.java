package a5_LoopingStatement;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {
		// user input example 
		
		System.out.println("Enter first value");
		 Scanner xyz=new Scanner(System.in);
		 int a=xyz.nextInt();
		 
		System.out.println("Enter second value");
		int b=xyz.nextInt();
		
		int c=a*b;
		
		System.out.println(c);

	}

}

