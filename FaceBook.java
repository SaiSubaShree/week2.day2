package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("venom");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SCR");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("33445454545");
		driver.findElement(By.id("password_step_input")).sendKeys("rwefdf");
		
		
		WebElement Ele = driver.findElement(By.xpath("//select[@id='day']"));
		Select dd= new Select(Ele);
		dd.selectByValue("29");
		
		// selecting month
		WebElement Ele1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select dd1= new Select(Ele1);
		dd1.selectByValue("11");
		
		//Selection the year
		WebElement Ele2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select dd2= new Select(Ele2);
		dd2.selectByValue("1987");
		
		// Select the gender
		driver.findElement(By.xpath("//label[text()='Female']")).click();	
		
		
		
		
	}

}
