package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Searching;
import Resources.base;

public class TC_searching extends base {

	@BeforeTest
	public void Invoke() {
		driver = initializeDriver();

		driver.get(" http://www.google.com");
	}

	@Test
	public void TESTS() throws InterruptedException {
		
		Searching sh = new Searching(driver);
		
		sh.SearchBar();
		sh.ListOfLinks();
		sh.LinkClick();
	}
	
	@AfterTest
	public void Logout() {
		driver.close();
	}
}
