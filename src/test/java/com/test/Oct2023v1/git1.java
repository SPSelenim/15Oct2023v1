package com.test.Oct2023v1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class git1 extends Inputdata1 {
public	SoftAssert sa=null;

	@Test
	public void f() {
		System.out.println("TestNG");
		loadData();
		// 17-10 Test ---- git1 11
		try {
			driver.get(myApplication);
			maximize();
			ClickGit();
			takescreen(this.getClass().getName());
			sa = new SoftAssert();
				String strActualTitle = driver.getTitle();
			String strExpectedTitle = "Git";
			sa.assertEquals(strActualTitle, strExpectedTitle);
			System.out.println("Actual : " + strActualTitle);
			System.out.println("Expected : " + strExpectedTitle);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
//			sa.assertAll();
		}

	}

	@AfterClass
	public void close() {
		driver.close();
	}

}
