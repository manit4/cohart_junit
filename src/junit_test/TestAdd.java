package junit_test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.cohart20.Arithmetic;

public class TestAdd {

	@Test
	public void test1() {
		
		Arithmetic obj = new Arithmetic();
		
		int actualValue = obj.add(70, 30);
		
		Assert.assertEquals(100, actualValue);
	}

	@Test
	public void test2() {
		
		Arithmetic obj = new Arithmetic();
		
		int actualValue = obj.add(7, 30);
		
		Assert.assertNotEquals(36, actualValue);
		
	}
	
}
