package oop2;

import Modifiers.Test;

class Test3 {

	public static void main(String[] args) {
		
//		encapCon obj = new encapCon();
//		obj.setBalance(1000);
//		
//		System.out.println(obj.getBalance());
		
		Student s1=new Student();
		s1.setAge(30);
		s1.getAge();
		s1.setId(123);
		s1.getId();
	
         System.out.println("student age is "+s1.getAge() + " and Id "+s1.getId());
         
	}

}
