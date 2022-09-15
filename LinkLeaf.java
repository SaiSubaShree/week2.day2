package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to select the link
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		driver.navigate().back();
		
		//To locate without clicking the url
		//driver.findElement(By.partialLinkText("grid")).click();	
		
		// am i broken
		//driver.findElement(By.xpath("//a[text()='Broken']")).click();
		
		
		
	}

}
