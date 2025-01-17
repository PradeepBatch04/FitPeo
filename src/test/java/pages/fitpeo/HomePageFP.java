package pages.fitpeo;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageFP {
	
	Actions actions;
	WebDriver driver;
	@FindAll(
			@FindBy(how = How.XPATH,using = "//div[contains(@class,'css-v0i3e8')]//descendant::a")
			) private List<WebElement> menuElements;
	
	
	public HomePageFP(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions= new Actions(driver);
		this.driver=driver;
	}

	
	public void selectMenuItem(String screen) {
	  try {
		for(WebElement menu:menuElements) {
		   //String actual = menu.getText().trim();
			String actual = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", menu);
			if(screen.equalsIgnoreCase(actual)) {
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", menu);
//				menu.click();
				break;
			}
		}
	
	  } catch (Exception e) {
		e.printStackTrace();
	  }
		
	}
}
