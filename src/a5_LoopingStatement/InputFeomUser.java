package a5_LoopingStatement;

import java.util.Scanner;

public class InputFeomUser {

	public static void main(String[] args) {
		
		System.out.println("enter the first no");
        Scanner X=new Scanner(System.in);
        int a=X.nextInt();
        
        System.out.println("enter the second no");
        Scanner Y=new Scanner(System.in);
        int b=Y.nextInt();
        
        int c=a+b;
        
        System.out.println(c);
	}

}
