import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      driver.manage().window().maximize();
      /*driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
      Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
      driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
      Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
     System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());*/
      
    	
      driver.findElement(By.id("checkBoxOption1")).click();		
      System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
      WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
      		
      if (checkbox.isSelected()) 
      {			
      checkbox.click(); 	
      }
      
	}

}
