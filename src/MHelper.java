import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MHelper {


	public static void main(String[] args) {
		
		// initializing WebDriver instance, opening Miniaylo webpage,
		// waiting for the last used web element appear on the webpage
		WebDriver driver = new FirefoxDriver();
		driver.get("http://miniaylo.finance.ua");
		WebDriverWait wait = new WebDriverWait(driver, 45);
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.cssSelector("div.span12.bottomsearch_line")));		
		
		
		System.out.println("123");
		
		
		

	}

}
