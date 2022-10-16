package Apnatest.Test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class upload_file_robot_class {

	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver","C:\\OneDrive\\Desktop\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/upload-download");
	
	WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(button).click().perform();
	
	Robot rb = new Robot();
	rb.delay(2000);

	StringSelection ss = new StringSelection("C:\\OneDrive\\Desktop\\CandidateHallTicket.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	//perform control + v action to paste file.
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
