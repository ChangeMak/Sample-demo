package Task_cls;

public class T02_Swapp {

	public static void main(String[] args) {
		// 2)Suppose we have two variables a=10 and b=20 then we have to print a=20 and b=10
		   
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a is :"+a);
		System.out.println("value of b is :"+b);

	}

}
