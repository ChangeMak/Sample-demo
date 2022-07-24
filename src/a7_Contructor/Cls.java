package a7_Contructor;

public class Cls {

	String Firstname;
	String Lastname;
	int age;
    String sex;
	long mobilenumber;
	String location;
	
    Cls(String Firstname,String Lastname,int age,String sex,long mobilenumber,String location){
    	
    	this.Firstname=Firstname;
    	this.Lastname=Lastname;
    	this.age=age;
    	this.sex=sex;
    	this.mobilenumber=mobilenumber;
    	this.location=location;
    	
    	System.out.println(this.Firstname+ " "+this.Lastname+" "+this.age+" "+this.sex+" "+this.mobilenumber+" "+this.location);
   }
	
    public static void main(String[] args) {
		
		Cls q =new Cls("Viresh","Borkar",25,"male",7744089745L,"Buldhana");
		
	}

}
