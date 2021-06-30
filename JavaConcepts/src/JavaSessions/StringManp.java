package JavaSessions;

public class StringManp {

	public static void main(String[] args) {
		
		String s1="      Hello world    ";
		System.out.println(s1.trim());
		
		String s2 = "HELLO we are learning Java";
		
		System.out.println(s2.length());
		System.out.println(s2.charAt(2));
		System.out.println(s2.indexOf("we"));
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		System.out.println(s2.contains("wel"));
		
		System.out.println(s2.substring(3, 10));
		String s[]=s2.split(" ");
		System.out.println(s.length);
		System.out.println(s[2]);
//		for(String e:s) {
//			System.out.println(e);
//		}
		
	}

}
