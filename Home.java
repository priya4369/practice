package Voyahh;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Home {
	public static WebDriver driver;
	@Test
	public void sum() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ls21139\\Desktop\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.voyaah.com/#/");
		driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-homepage/ion-header/header/nav/ul/li[5]/div/p")).click();
	driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-modal/div[2]/app-login/div/form/div[1]/div/input")).sendKeys("9705290707");
	driver.findElement(By.cssSelector("#ion-overlay-1 > div.modal-wrapper.ion-overlay-wrapper.sc-ion-modal-md > app-login > div > form > input")).sendKeys("Gopi@1994");
//	driver.findElement(By.cssSelector("#ion-overlay-1 > div.modal-wrapper.ion-overlay-wrapper.sc-ion-modal-md > app-login > div > form > div.mt-2.text-right > button")).click();
	
	
	
	
}
}
