package com.cohart20;

public class Main {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Manit", 39, 45);//Parameterized constructor... 
		
		

		
		//s1.setName("Manit");      s1.setAge(50);     s1.setScore(34); I do not need this line to set values since I created object
		//by parameterized constructor...
		
		System.out.println(s1.getName());
		System.out.println(s1.getScore());
		System.out.println(s1.getAge());
		
		
//		
		String resultStatus = s1.checkResult();
		
		System.out.println(resultStatus);
	}

}



//public class Main {
//	
//	public static void main(String[] args) {
//		
//		Student s1 = new Student();// This object is created with default values and in this case, name will be given null, age is given 0
//									// and the score is also 0. Post Object creation, we actually set the instance variables by 
//									//respective setters
//		
//		
////		s1.name = "Manit";
////		s1.age = 25;
////		s1.score = 78;
//		
//		s1.setName("Manit");      s1.setAge(50);     s1.setScore(34);
//		
//		System.out.println(s1.getName());
//		System.out.println(s1.getScore());
//		System.out.println(s1.getAge());
//		
//		
////		
//		String resultStatus = s1.checkResult();
//		
//		System.out.println(resultStatus);
//	}
//
//}



//public class Main {//This is wrong way of assigning values in a below program to instance variables...since every instance variables are supposed to be set
//by the method. Which leads to the concept of Encapsulation. In Encapsulation, we keep our variables private and methods public in order 
// to save instance variables not to be set directly but set by the method call....
//	
//	public static void main(String[] args) {
//		
//		Student s1 = new Student();
//		
//		s1.name = "Manit";
//		s1.age = 25;
//		s1.score = 78;
//		
//		String resultStatus = s1.checkResult();
//		
//		System.out.println(resultStatus);
//	}
//
//}
