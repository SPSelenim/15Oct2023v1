package com.test.Oct2023v1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Amz1 extends Inputdata1 {

	@Test
	public void f() {
		System.out.println("TestNG");
		loadData();

		try {
			driver.get(myApplication);
maximize();
			ClickAmaz();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}

}