package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
				//Select the tool
		WebElement Ele = driver.findElement(By.xpath("//div[@class='col-12']/select"));
		Select dd= new Select(Ele);
		dd.selectByVisibleText("Cypress");
		
				//Chose the prefered country
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//ul[@id='j_idt87:country_items']/li[text()='Brazil']")).click();
		
		
				//verify the country
		//driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		//WebElement EleList = driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));*/
		
		// to select the course
		//driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
		driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[text()='Appium']")).click();
		//driver.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li[text()='Appium']")).click();
		
				// select th launguage
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//ul[@id='j_idt87:lang_items']/li[text()='Tamil']")).click();
			
		
		//driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		//
		driver.findElement(By.xpath("//ul[@id='j_idt87:value_items']/li[@id='j_idt87:value_1']")).click();
	}

}
