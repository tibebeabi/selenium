package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(id = "activity_loaded")
	private WebElement header;

	public HomePage() {
		super();
	}

	public String confirmationHeader() {
		return header.getText();
	}


}
