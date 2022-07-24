package Task_cls;

public class T02_Swap {

	public static void main(String[] args) {
		/* 1) Swap the value with using third variable
		   */
       int a=10;
       int b=20;
       int swap;
       
      swap=b;
      b=a;
      a=swap;
       
       System.out.println("Swapped the value of a is :"+a);
       System.out.println("Swapped the value of b is :"+b);
	}

}
