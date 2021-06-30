package JavaSessions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setimpl {

	public static void main(String[] args) {
	
		// Syntax:
		
		Set<String> s1=new HashSet<String>();
		
		//does not allow Duplicates
		
		//add
		
		s1.add("UK");
		s1.add("Europe");
		s1.add("Aus");
		s1.add("India");
		s1.add("India");
		s1.add("UK"); 
		
		System.out.println(s1);
		
		System.out.println(s1.contains("India"));
		
		//for each
		
		for(String e:s1) {
			System.out.println(e);
		}
		
		//Remove:
		System.out.println("------Remove UK----");
		s1.remove("UK");
		
		System.out.println(s1);
		
		System.out.println("------Printing elemnts using Iterator----");
		//Iterator
		Iterator it =s1.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
