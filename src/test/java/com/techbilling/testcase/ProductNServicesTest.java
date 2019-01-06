package com.techbilling.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;

public class ProductNServicesTest extends TestBase {

		// import all classes
		HomePage homepage;
		LoginPage loginpage;
		ProductNServicesTest productservices;

		// constructor

		public ProductNServicesTest() {

			super();
		}

		@BeforeMethod
		public void setup() {
			initialization();
			loginpage = new LoginPage();
			productservices = new ProductNServicesTest();
			homepage = new HomePage();

		}

		@Test(priority = 1)
		public void newproductTest() {

			homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			homepage = productservices.productNservices(prop.getProperty("name"), prop.getProperty("sales_price"),
					prop.getProperty("item_number"), prop.getProperty("description"));
		}

		private HomePage productNservices(String property, String property2, String property3, String property4) {
			// TODO Auto-generated method stub
			return null;
		}

		@AfterMethod
		public void teardown() {
			driver.quit();
		}

	}



