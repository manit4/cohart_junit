package junit_test;

import org.junit.Test;

import com.cohart20.Student;

import junit.framework.Assert;

public class TestResultStatus {

	@Test
	public void test1() {
		
		Student s1 = new Student("Manit", 45, 67);
		
		String status = s1.checkResult();
		
		Assert.assertEquals("Passed with First Class", status);
		
	}
	@Test
	public void test2() {
		
		Student s1 = new Student("Manit", 45, 89);
		
		String status = s1.checkResult();
		
		Assert.assertEquals("Distinction", status);
		
	}
	@Test
	public void test3() {
		
		Student s1 = new Student("Manit", 45, 45);
		
		String status = s1.checkResult();
		
		Assert.assertEquals("Passed with Third Class", status);
		
	}
	@Test
	public void test4() {
		
		Student s1 = new Student("Manit", 45, 50);
		
		String status = s1.checkResult();
		
		Assert.assertEquals("Passed with Second Class", status);
		
	}
	@Test
	public void test5() {
		
		Student s1 = new Student("Manit", 45, 39);
		
		String status = s1.checkResult();
		
		Assert.assertEquals("Sorry, you failed", status);
		
	}
}
