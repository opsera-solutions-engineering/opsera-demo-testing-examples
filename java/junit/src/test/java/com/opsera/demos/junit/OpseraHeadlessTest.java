package com.opsera.demos.junit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;


public class OpseraHeadlessTest {
	
	@BeforeClass
	public static void beforeEachClass() {
		System.out.println("-------------BEFORE-CLASS-------------");
		System.out.println("This is executed before each class");
		System.out.println("-------------BEFORE-CLASS-------------");
	}

	@Before
	public void beforeEachTest() {
		System.out.println("-------------BEFORE-------------");
		System.out.println("This is executed before each Test");
		System.out.println("-------------BEFORE-------------");
	}

	@After
	public void afterTest() {
		System.out.println("-------------AFTER-------------");
		System.out.println("The browser has been closed and quit.");
		System.out.println("-------------AFTER-------------");
	}

	@Test
	public void testOpsera() {
		String driverPath = System.getenv("CHROMEDRIVER_PATH");
		// Set the chrome driver
		// System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		if(driverPath != null){
			System.setProperty("webdriver.chrome.driver", driverPath);
		}
		else {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/mac/chromedriver");
		}

		// Create Object of ChromeOption Class
		ChromeOptions options=new ChromeOptions();

		//add the –headless argument in option class which will run test in Headless mode
		//Set the setHeadless is equal to true which will run test in Headless mode
		options.addArguments("--headless");

		System.out.println("-------------TEST-------------");
		// pass the option object in ChromeDriver constructor
		ChromeDriver driver=new ChromeDriver(options);

		// Provide any url
		driver.get("http://opsera.io");

		System.out.println("Title is "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Opsera"));
		System.out.println("-------------TEST-------------");
		// Close the instance
		driver.quit();
	}

	@Ignore
	@Test
	public void testIgnore() {
		System.out.println("This test will be ignored.");
	}
}
