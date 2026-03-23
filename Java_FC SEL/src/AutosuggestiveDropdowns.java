import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutosuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	   //System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
	    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
	    //System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	    Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		driver.findElement(By.id("autosuggest")).sendKeys("ch");
		Thread.sleep(3000);
		//List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']//a")); // Can be done with an XPath or CSS selectors
		
		driver.findElement(By.xpath("//ul[@id='ui-id-1']//a[normalize-space()='Czech Republic']")).click();
		
		/*for (WebElement option : options) {
			
			if (option.getText().equalsIgnoreCase("Czech Republic")) {
				
			option.click();
			break;
			}
		*/
		
	}
}
