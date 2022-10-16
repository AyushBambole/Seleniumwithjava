package Apnatest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\OneDrive\\Desktop\\SeleniumTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source = driver.findElement(By.id("//div[@id='box106']"));//Italy
		WebElement target = driver.findElement(By.id("//div[@id='box6']"));//Rome
Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
		
WebElement source1= driver.findElement(By.id("//div[@id='box107']"));//Spain
WebElement target1= driver.findElement(By.id("//div[@id='box7']"));//Madrid
Actions ace= new Actions(driver);
ace.dragAndDrop(source1,target1).perform();
		
WebElement source2= driver.findElement(By.id("//div[@id='box101']"));//Norway
WebElement target2= driver.findElement(By.id("//div[@id='box1']"));//Oslo
Actions acr = new Actions(driver);
acr.dragAndDrop(source2, target2).perform();
acr.dragAndDrop(source2, target2).perform();
		
WebElement source3= driver.findElement(By.id("//div[@id='box104']"));//Denmark
WebElement targer3= driver.findElement(By.id("//div[@id='box1']"));//Copenhagen
Actions acy = new Actions(driver);
acy.dragAndDrop(source3, targer3).perform();

		
//WebElement source4= driver.findElement(By.id("//div[@id='box105']"));//SouthKorea
//WebElement target4= driver.findElement(By.id("//div[@id='box5']"));//Seoul
		
//WebElement source5= driver.findElement(By.id("//div[@id='box102']"));//Sweden
//WebElement target5= driver.findElement(By.id("//div[@id='box2']"));//Stockholem
		
//WebElement source6= driver.findElement(By.id("//div[@id='box103']"));//United States
//WebElement target6= driver.findElement(By.id("//div[@id='box3']"));//Washington
		
		



		

		
		

	}

}
