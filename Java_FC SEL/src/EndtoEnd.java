import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
			Assert.assertTrue(true);
		}
		
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		driver.findElement(By.className("paxinfo")).click();
		System.out.println (driver.findElement(By.className("paxinfo")).getText());
		Thread.sleep(3000);
		int i = 0;
		while (i<3) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		System.out.println (driver.findElement(By.className("paxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select (staticDropdown);
		dropdown.selectByIndex(3);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

	}

}
