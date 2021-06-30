package JavaSessions;

public class Human {

	String name;
	int age;
	String address;
	
	
	public Human() {
		name="vivek";
		age=30;
		address="3,cowperway";
		
	
	}

	public static void main(String[] args) {
		
		Human h1=new Human();
		System.out.println(h1.name + " "+h1.age +" "+h1.address);
	}

}
