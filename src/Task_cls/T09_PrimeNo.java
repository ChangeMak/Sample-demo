package Task_cls;
import java.util.Scanner;
public class T09_PrimeNo {

	public static void main(String[] args) {
				int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int b=2;
        while(b<=num) {
        	if (num%b==0) {
        		break;
        }
        	b++;
        }
        if (b==num) {
         System.out.println("Prime number");
        }
        else {
        	System.out.println("Not prime");
        }
     }
}
