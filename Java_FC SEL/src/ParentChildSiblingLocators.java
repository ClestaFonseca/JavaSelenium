import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ParentChildSiblingLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.findElement(By.xpath("div[class='QS5gu sy4vM']")).click();
	//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/div/button[1]")).getText());
	
	}

}
