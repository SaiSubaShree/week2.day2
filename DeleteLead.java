package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9999944444");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		String result = findElement.getText();
		System.out.println(" The result is " +result);
		findElement.click(); 	
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.id("ext-gen246")).sendKeys(result);
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(5000);
		 WebElement Ele = driver.findElement(By.xpath("//div[@id='ext-gen437']"));
		 String text = Ele.getText();
		System.out.println("The verify msg is : "+ text);
		if(text.equalsIgnoreCase("No records to display"))
		{
			System.out.println("This message confirms the successful deletion");
		}
		else {
			System.out.println("record deletion failed");
		}
		
		
		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	

}
