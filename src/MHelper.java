import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MHelper {


	public static void main(String[] args) {
		
		// preparing data for input
		String currency = "USD";
		boolean weBuy = true;
		
		
		
		// initializing WebDriver instance, opening Miniaylo webpage,
		// waiting for some bottom-located web element appear on the webpage
		WebDriver driver = new FirefoxDriver();
		driver.get("http://miniaylo.finance.ua/ru/");
		WebDriverWait wait = new WebDriverWait(driver, 45);
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.cssSelector("div.span12.bottomsearch_line")));
		
		/*WebDriverWait wait2 = new WebDriverWait(driver, 45);
		wait2.until(ExpectedConditions.visibilityOfElementLocated
				(By.cssSelector("input.typeahead.tt-input.selected")));	*/	
		
		System.out.println("123");
		
		// typing city into the "input region" field
		WebElement city = driver.findElement(By.cssSelector("input.typeahead.tt-input"));
		//if (city.isDisplayed()){System.out.println("city is here");}
		city.click();
		city.clear();
		
		
		city.sendKeys("киев");
		
		
		

	}

}
