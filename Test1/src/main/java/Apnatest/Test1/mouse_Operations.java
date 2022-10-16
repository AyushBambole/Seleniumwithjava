package Apnatest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_Operations {

	public static void main(String[] args) {
	    //Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\OneDrive\\Desktop\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Go to the URL
		driver.get("https://demoqa.com/buttons");
	
		//FindElement Right Click
		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		//Click on Right Click
		Actions act = new Actions(driver);
		
		act.contextClick(button).perform();
		
		//FindElement Double Click
		WebElement doublebutton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions acs = new Actions (driver);
		acs.doubleClick(doublebutton).perform();
		
		//Find Element
		driver.findElement(By.xpath("//button[@id='y18Xc']")).click();
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
