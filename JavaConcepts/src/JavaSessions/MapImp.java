package JavaSessions;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapImp {

	
	public static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	
	public static void main(String[] args) {
		

		
		MapImp m1=new MapImp();
		 add(2,3);
		
		
		
		
		
		//Stores values  in key/Value pair
		//Stores one null key and mlutiple null  values
		//No duplicates in key allowed
		//maintains order
		
		//Syntax:
		
		HashMap<Integer, String>  map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Java");
		map1.put(5, "c++");
		map1.put(3, "Python");
		
		HashMap<String, String>  map2 = new HashMap<String, String>();
		
		
		map2.put("username", "sonia");
		map2.put("password", "sonia1");
		map2.put("password", "soniaabc");
		//map2.put(null, "soniaabc");
		//map2.put(null, "soniadef");
		//map2.put("password", null);
		//map2.put("address", null);
		//System.out.println(map2);
		
		//System.out.println(map2.get("username"));
		
		//Remove:
		//map2.remove("password");
		//System.out.println(map2);
		
		
		//map2.replace("username", "Sid");
		//System.out.println(map2);
		
		
		//for
		
		for(Entry m: map2.entrySet()) {
		//for(String ele:array)
			
			System.out.println(m.getKey()+ " " + m.getValue());
		}
			
		//for(String ele:array)	
		
		
	}

}
