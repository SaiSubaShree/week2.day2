package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioLG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub ui-radiobutton ui-widget
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		// select the radio button
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']//div")).click();
		
		
					//unselected
		WebElement First = driver.findElement(By.xpath("//label[text()='Hyderabad']"));
		First.click();
		System.out.println("The first time it is clicked");
		First.click();
		boolean unsel = driver.findElement(By.xpath("//label[text()='Hyderabad']")).isSelected();
		if(unsel==false)
		{
			System.out.println("The Button is unselected");
		
		}
		else
		{
			System.out.println("The Button is selected");
		}
		
		// is radio button selected
		boolean selected = driver.findElement(By.xpath("//table[@id='j_idt87:console2']//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c']")).isSelected();
		System.out.println("The selection value is"+ selected);
		if(selected==false)
		{
			System.out.println("The default button is selected as safari");
		}
		else
		{
			System.out.println("The default is not selected as safari");
		}
		
		// select only if its not selected
		boolean Sel = driver.findElement(By.xpath("//div[@id='j_idt87:age']//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c']")).isSelected();
		System.out.println("The value is :"+Sel);
		if(Sel==false)
		{
			System.out.println("The value is already selected");
		}
		else
		{
			driver.findElement(By.xpath("//div[@id='j_idt87:age']//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c']")).click();
		}
	}

}
