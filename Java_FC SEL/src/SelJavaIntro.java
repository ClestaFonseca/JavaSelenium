import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelJavaIntro {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\clest\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
        driver.quit();*/
        
        int [] array = new int [5];
        array[0] = 1;
        array [1] = 10;
        array [2]= 5;
        array [3]= 100;
        array [4]= 20;
        
        int [] arr = {1,2,3,4,5,6,7};
        
        System.out.println(arr[3]);
        for (int i =0; i<arr.length; i++) {
        	
        	System.out.println(arr[i]);
        	
        }
          for (int i =0; i<array.length; i++) {
        	
        	System.out.println(array[i]);
        	
        }
          String [] name = {"Clesta", "is", "Wise" };
          
          System.out.println(name[0]);
          
          for(int a=0; a<name.length; a++) {
        	  
        	  System.out.println(name[a]);
          }
	}

}
