package junit_test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//Test-Suite is a test-file which is used to execute all the test-files at once or in a single go. Otherwise, you will have to 
//execute all the test-files one by one...
//Usually, Test-Suite is not used to mention or specify test-cases. To write test-cases, we have test-files...


@RunWith(Suite.class)//This is Test-Suite file. The procedure to create a Test-Suite file is to create a regular test file and annotate
					//the class with annotation "@RunWith(Suite.class)"
@SuiteClasses({Test1.class, Test2.class})//This annotation used here to tell the system which all test files which you would like to 
										//execute when I execute this Test-Suite... 
public class TestSuite {

	@Test
	public void test() {
	}

}
