import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("ch");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']//a")); // Can be done with an XPath or CSS selectors
		
		for (WebElement option : options) {
			
			if (option.getText().equalsIgnoreCase("Czech Republic")) {
				
			option.click();
			break;
			}
		}
		
	}
}
