package a95_Array;

public class a2_Double_D_A {

	public static void main(String[] args) {
		
		int[][] a= {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println(a[0][0]);   // 10
		System.out.println(a[0][2]);   //30
		System.out.println(a[1][0]);   //40
		System.out.println(a[1][2]);   //60
		System.out.println(a[2][2]);  // 90
		
		System.out.println(a[0].length);  //3
		//System.out.println(a[][.length]);   error
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a.length;j++) {
				System.out.print(a[i][j] + " ");               /*10 20 30 
				                                                 40 50 60 
				                                                 70 80 90 */
			}	
			System.out.println();
		}
	}

}
