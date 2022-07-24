package Task_cls;

public class T_Fabo {

	public static void main(String[] args) {
		// Fabonacci series
		int a=0;
		int b=1;
		int sum=a+b;
		
		for(int c=1;c<=11;c++) {
		
			sum=a+b;

			a=b;
			b=sum;
			
			System.out.print(sum +",");
		}

	}

}
