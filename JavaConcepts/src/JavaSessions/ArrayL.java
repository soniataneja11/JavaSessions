package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayL {
	
	//Dynamic array

	public static void main(String[] args) {
		
		//Syntax: 
		//	ArrayList<datatype> ar=new ArrayList<datatype>
			//int ar1[]=new int[10]
			
		ArrayList<String> carNames=new ArrayList<String>();
		carNames.add("BMW");
		carNames.add("Volvo");
		carNames.add("Audi");
		carNames.add("Ford");
		carNames.add("Merc");
		carNames.add("Merc");
		
		//Get an item
		//System.out.println(carNames.get(3));
		
		//Update an item
		//carNames.set(1, "Ferarri");
		
		//System.out.println(carNames);
		
		//remove an elemt
		carNames.remove(3);
		System.out.println(carNames);
		
		//carNames.clear();
		//System.out.println(carNames);
		
		Collections.sort(carNames);
		System.out.println(carNames);
		System.out.println("Size of Array:"+carNames.size());
		
		
		ArrayList<Double> salary = new ArrayList<Double> ();
		salary.add(20000.0);
		salary.add(24000.0);
		salary.add(25000.0);
		
		for (double x :salary)	
		{
			
			if (x==25000.0)
			{
				 x =23000.0;
				//System.out.println(x);
			}
             System.out.println(x);
		}
		//update salary
	
	}
	


}
