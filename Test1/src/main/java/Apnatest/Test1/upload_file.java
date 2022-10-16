package Apnatest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\OneDrive\\Desktop\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		
		driver.findElement( By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\OneDrive\\Desktop\\CandidateHallTicket.pdf");
		
		
		
		
		
		
	}

}
