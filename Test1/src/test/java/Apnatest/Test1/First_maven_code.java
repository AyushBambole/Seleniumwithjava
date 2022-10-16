package Apnatest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_maven_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\OneDrive\\Desktop\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http:\\www.google.com");

		String title = driver.getTitle();

		System.out.println("Page Title : " + title);

		driver.getCurrentUrl();

		System.out.println("URL : " + driver.getCurrentUrl());
		
		System.out.println(("page source :") + driver.getPageSource());
         
		driver.close();
	}

}
