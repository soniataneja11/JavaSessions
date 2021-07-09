package Modifiers;

public class Test {
	
	public int publicVariable=10;
	private int privateVaribale=20;
	protected int protectedVarible=30;
	int defaultVarible=40;

	

	public static void main(String[] args) {
		
		Test obj = new Test();
		System.out.println(obj.publicVariable);
		System.out.println(obj.privateVaribale);
		System.out.println(obj.protectedVarible);
		System.out.println(obj.defaultVarible);
		
	}

}
