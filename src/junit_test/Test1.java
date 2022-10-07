package junit_test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test1 {

	
	@Test
	public void test1() {
		System.out.println("I am first test case...");
	}
	
	@Test
	public void test2() {
		System.out.println("I am second test case...");
	}
}

//public class Test1 {
//
//	@BeforeClass//This is the annotation used to annotate the method executing only once for all the test-cases to provide the right
//				//execution environment in order to let every test-cases executed successfully irrespective of all test-cases are passed 
//				//or failed.
//	public static void setUpBeforeClass() {
//		System.out.println("inside @BeforeClass ");
//	}
//	
//	@AfterClass//This is the annotation used to annotate the method executing only once but after the test-cases are executed
//				//successfully...
//	public static void tearDownAfterClass()  {
//		System.out.println("inside @AfterClass");
//	}
//	
//	@Before//This annotation is used to annotate the method if you want any method to be executed right before any test-case starts
//			//to execute so if you have 5 test-cases, you would see the method annotated with @Before will execute 5 times or right before
//				//every test case....
//	public void setUp() {
//		System.out.println("inside @Before");
//	}
//	
//	@After//This annotation is used to annotate the method if you want any method to be executed right after every test-case is done... 
//	public void tearDown() {
//		System.out.println("inside @After");
//	}
//	
//	@Test
//	public void test1() {
//		System.out.println("I am first test case...");
//	}
//	
//	@Test
//	public void test2() {
//		System.out.println("I am second test case...");
//	}
//}

//public class Test1 {//You can have as many test cases in test file...And this is the example of 
//					//multiple test cases in a test file...
//
//	@Test
//	public void test1() {
//		System.out.println("I am first test case...");
//	}
//	
//	@Test
//	public void test2() {
//		System.out.println("I am the second case...");
//	}
//
//}


//
//public class Test1 {//This is test file....
//
//	@Test//this(@Test) annotation which is used to tell the system that the method I have written 
//	//over is a test case...
//	public void test() {//This is test case....You can use any method name for test case/s
//		System.out.println("I am first test case...");
//	}
//
//}









































