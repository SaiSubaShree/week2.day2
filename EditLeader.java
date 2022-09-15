package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeader {

	
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
		//driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input")).sendKeys("Soorya");
		driver.findElement(By.id("ext-gen248")).sendKeys("Soorya");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
							//Different xpaths
		//driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10207']")).click();

		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[text()='10207']")).click();
		//driver.findElement(By.linkText("10207")).click();
		//driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();
		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@id='ext-gen808']")).click();
		
		
		String title = driver.getTitle();
		System.out.println("The title is " +title);
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("The page is validated and result is true");
		}
		else
		{
			System.out.println("The page is validated and result is False");
		}
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Humana");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The text is ;" +text);
		driver.close();
	}
}