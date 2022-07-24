package a96_excp;

public class a1 {

	public static void main(String[] args) {
		
	try {
		int a=100;                           //case 1: Error: try---> catch---> finally
		int b=0;                            //case 2: not Error: try---> finally
		
		int d=a/b;
	
		System.out.println(d);
		}
	
    catch(Exception d){                   //Write Exception and give one new variable name 
	System.out.println(d);
	}
	finally {
		System.out.println("cleanup code");
	}
}

}

