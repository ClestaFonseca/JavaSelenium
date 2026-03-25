import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment2Forms {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        //driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Clesta Fonseca");
        //driver.findElement(By.cssSelector("input.form-control ng-pristine ng-invalid ng-touched")).sendKeys("Clesta");
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("Clesta");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("clesta.fonseca@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123669");
       System.out.println(driver.findElement(By.xpath("//div[@class='form-check'] //input")).isSelected());
       driver.findElement(By.xpath("//div[@class='form-check'] //input")).click();
       System.out.println(driver.findElement(By.xpath("//div[@class='form-check'] //input")).isSelected());
       //driver.findElement(By.xpath("//select[@id = 'exampleFormControlSelect1']/option[2]")).click();
       WebElement location = driver.findElement(By.id("exampleFormControlSelect1"));
       Select dropdown = new Select (location);
       //dropdown.deselectByValue("Female");
       dropdown.selectByVisibleText("Female");
       driver.findElement(By.id("inlineRadio2")).click();
       driver.findElement(By.name("bday")).sendKeys("02/02/1992");
       driver.findElement(By.cssSelector(".form-control")).click();
       driver.findElement(By.cssSelector("input[value='Submit'")).click();
      System.out.println (driver.findElement(By.cssSelector("div[class*='alert'")).getText());
        
        
	}

}
