package Apnatest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class image_links {

	public static void main(String[] args) {
		
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\OneDrive\\Desktop\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		//Get Url
		driver.get("https://www.flipkart.com/");

		//Find web element image link
		driver.findElement(By.xpath("//img[@title='Flipkart']"));
		
		//Check the title of the page to cross verify if it is correct or not
		if (driver.getTitle().equals("Flipkart")){
			System.out.println("Test Pass");
		   }
		 else {
			System.out.println("Test Failed");
		}
		
		//close the browser
		driver.close();
	}

}
