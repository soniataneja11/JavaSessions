package JavaSessions;

public class Emplyee {
	
	String Name;
	String dob;
	Double Salary;
	boolean IsPermanent;
	int age;

	public static void main(String[] args) {
		
		
		Emplyee e1 = new Emplyee();
		e1.Name ="John";
		e1.dob="11-12-1087";
		e1.Salary=45000.0;
		e1.IsPermanent=true;
		e1.age= 34;
		
		Emplyee e2 = new Emplyee();
		
		e2.Name ="Tom";
		e2.dob="12-09-1987";
		e2.Salary=45000.0;
		e2.IsPermanent=false;
		e2.age= 34;
		
		Emplyee e3 = new Emplyee();
		e3.Name ="Jack";
		e3.dob="11-12-1777";
		
		
		
		System.out.println(e1.Name +" "+ e1.age+" "+e1.dob+" "+e1.Salary+" "+e1.IsPermanent);
		
		System.out.println(e2.Name +" "+ e2.age+" "+e2.dob+" "+e2.Salary+" "+e2.IsPermanent);
		
		
		System.out.println(e3.Name +" "+ e3.age+" "+e3.dob+" "+e3.Salary+" "+e3.IsPermanent);
	}

}
