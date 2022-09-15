package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChkLeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
				//Select the text box
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
				// select notification
		//WebElement Ele = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		//Ele.click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//String text = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		//System.out.println("The pop up text is :"+text);
		String Notification = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']//input[@id='j_idt87:j_idt91_input']")).getAttribute("aria-checked");
	System.out.println(" the notification is : "+ Notification);
	if(Notification.equalsIgnoreCase("true"))	
	{
		System.out.println("The check box is chkd");
	}
	else
	{
		System.out.println("The text box is not selected");
	}
	
						// SELECT MULTIPLE LANG
	driver.findElement(By.xpath("//label[text()='Java']")).click();
	driver.findElement(By.xpath("//label[text()='Python']")).click();
	
						// select the tristate
	driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	
	//Thread.sleep(0);
	/*String sta1 = driver.findElement(By.xpath("//span[@class='ui-growl-title']/p")).getText();
	
	System.out.println("The value of state is :" +sta1);
	String State = driver.findElement(By.xpath("//span[contains(text(),'State has been changed')]")).getText();
	System.out.println("The value of state is :" +State);
	if(State.equalsIgnoreCase("State has been changed"))
	{
		System.out.println("The state has been checked");
	
	}
	else
	{
		System.out.println("The state has been unchecked");
	}*/
					//to chk the toggle button is enabled
	driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	boolean selected = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).isEnabled();
	
	System.out.println("The selected value is :"+selected);
	if(selected==true)
	{
		System.out.println("The toggle button is seleceted");
	}
	else
	{
		System.out.println("The toggle value is not selected");
	}
					// to chk the button is disabled
	boolean enabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isSelected();
	System.out.println("The enable value is :" +enabled);
	if(enabled==false)
	{
		System.out.println("The Checkbox  is disabled");
	}
	else
	{
		System.out.println("The checkbox is enabled");
		
	}
	
					// select multiple items
	
	driver.findElement(By.xpath("//div[@id='j_idt87:multiple']/ul")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@data-item-value='Miami']")).click();
	 driver.findElement(By.xpath("//ul[@role='group']/li[@data-item-value='Miami']")).click();
	//int size = list.size();
	//list.size()
	//span class=ui-growl-titlespa
	}

	}
	
			





