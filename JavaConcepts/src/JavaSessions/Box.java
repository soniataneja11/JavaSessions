package JavaSessions;

public class Box {

	
	int h;
	int w;
	
//constructor is  used to intilaize class variable
	
	public Box() {
		System.out.println("hello I'm box");
		
	}
	
	
	public Box(int height) {
		System.out.println("I'm constructr with height:"+height);
		
	}
	
	public Box(int height, int width) {
		System.out.println("I'm constructr with height:width"+height+ width);
		
		h=height;
		w=width;
	}
	
	
	public static void main(String[] args) {
		
		Box c1=new Box();
		Box c2=new Box(10);

		Box c3=new Box(10,20);
		System.out.println(c3.w);
		
		
		

	}

}
