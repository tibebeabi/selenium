
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class ProductNServices extends TestBase {

	// find all locators
	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[6]/a/span[1]")
	WebElement ProductNservices;
	@FindBy(xpath = "//*[@href='http://techfios.com/test/billing/?ng=ps/p-new/']")
	WebElement NewProduct;

	@FindBy(id = "name")
	WebElement Name;
	@FindBy(id = "sales_price")
	WebElement SalesPrice;
	@FindBy(id = "item_number")
	WebElement ItemNumber;
	@FindBy(id = "description")
	WebElement Description;
	@FindBy(id = "submit")
	WebElement submitBut;

	// contractor
	public ProductNServices() {

		// pagefactory
		PageFactory.initElements(driver, this);
	}

	// validate login page
	public String validateLoginPage() {
		return driver.getTitle();
	}

	public HomePage newservice(String name, String sales_price, String item_number, String description) {
		ProductNservices.click();
		NewProduct.click();

		Name.sendKeys(name);
		SalesPrice.sendKeys(sales_price);
		ItemNumber.sendKeys(item_number);
		Description.sendKeys(description);
		submitBut.click();

		return new HomePage();

	}

}
