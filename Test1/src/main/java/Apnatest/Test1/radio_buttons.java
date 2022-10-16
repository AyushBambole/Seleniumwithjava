package Apnatest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_buttons {

	public static void main(String[] args) {
		//Launch Browser
		System.setProperty("webdriver.chrome.driver" , "C:\\OneDrive\\Desktop\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://udyamregistration.gov.in/Government-India/Ministry-MSME-registration.htm");
	
		//Login Button
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/header[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]")).click();
		
		//Client Login
		driver.findElement(By.xpath("//nav[@class='nav-menu d-none d-lg-block']//ul//li[@class='drop-down']//ul//li//a[normalize-space()='Udyami Login']")).click();
		
		driver.findElement(By.xpath("//label[@for='ctl00_ContentPlaceHolder1_rblUamOtp_1']"));;
	}

}
