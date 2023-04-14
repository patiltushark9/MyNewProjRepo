package moduleLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage 
{
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement sortDropdown;
	@FindBy(xpath="(//div[@class='inventory_item'])[1]//div[@class='inventory_item_price']") private WebElement productPrice;
	
	public InventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void checkLowestPrice()
	{
		Select selectObj=new Select(sortDropdown);
		
		selectObj.selectByVisibleText("Price (low to high)");
		
		String price=productPrice.getText();
		
		int prodPrice=Integer.parseInt(price);
		
		if(prodPrice>0)
		{
			System.out.println("Price is valid");
		}
	}
}
