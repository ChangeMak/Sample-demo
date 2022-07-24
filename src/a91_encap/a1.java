package a91_encap;  //In that we declared the variable as a private and use getter,setter method 

public class a1 {               //data hiding 

	private int Rollno = 101;
	
	public void setRollno(int Rollno) {
		
		this.Rollno=Rollno;
	}
	
	public int  getRollno() {
		return Rollno;
	}
	
	public static void main(String[] args) {
		
       a1 o = new a1();
       System.out.println(o.getRollno());
       
       o.setRollno(102); 
       System.out.println(o.getRollno());
	}

}
