package Apnatest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	


	public static void main (String[] args) {
		
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\OneDrive\\Desktop\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//open the website
		
	driver.get("https://www.opencart.com/index.php?route=account/register");
	
	driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("Rekit123");
	
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("rekitsir@gmail.com");
	
	driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Sirsiya");
	
	driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Rekit");
	
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Rekit121212");
	
	WebElement element = driver.findElement(By.id("input-country"));
	
	Select dropdown = new Select (element);
	
	//dropdown.selectByVisibleText("India");
	
	dropdown.selectByValue("99");
	
	 if( dropdown.isMultiple());
	{
		System.out.println("Drop Down is Multiple" );
	}
	 {
	 System.out.println("Drop Down is Not MUltiple");	
	}

	
	
	
	
	
		
		
	}
	

}
