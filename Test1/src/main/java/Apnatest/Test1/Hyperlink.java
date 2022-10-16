package Apnatest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\OneDrive\\Desktop\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver() ;
	    
	    driver.manage().window().maximize();
	   
	    driver.get("https://www.flipkart.com/");
	    
	    List <WebElement> linkElements = driver.findElements(By.tagName("div"));
	    
	    System.out.println("Total links on web Page:" + linkElements.size());
	    
	    for (WebElement el:linkElements)
	    {
	    	System.out.println(el.getText());
	    }
	    
	    
	    driver.close();
	    
	    
	    
	    
	    
	    

	}

}
