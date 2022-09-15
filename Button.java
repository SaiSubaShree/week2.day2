package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		
					//Click and get the title
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span[@class='ui-button-text ui-c']")).click();
		String title = driver.getTitle();
		System.out.println("The title of the page is :" +title);
		driver.navigate().back();
		
		
					// isenabled
		//driver.get("https://leafground.com/button.xhtml");
		boolean enabled = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		if(enabled==false)
		{
			System.out.println("The button is disabled");
		}
		else
		{
			System.out.println("The button is enabled");
		}
		Point location = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("The x position is "+ x);
		System.out.println("The x position is "+ y);
		
					// to find the color
		String colorButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("color");
	System.out.println("The color of the button is :" + colorButton);
	
					//height of button
	Dimension size = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
	int height = size.getHeight();
	int width = size.getWidth();
	System.out.println("The height is "+height);
	System.out.println("The height is "+width);
	
					//mouse move over
	 WebElement MouseWebEle = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
	String valBeforeMouse = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).getCssValue("background-color");
	System.out.println("The value is before mouse :" +valBeforeMouse);
	//WebElement findElement1 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
	Actions action=new Actions(driver);
	action.moveToElement(MouseWebEle).build().perform();
	Thread.sleep(5000);
	WebElement AfterMousemove = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/span"));
	String valAfterMouse = AfterMousemove.getCssValue("background-color");
	System.out.println("The value after mouse move " + valAfterMouse);
	
	if(valBeforeMouse.equals(valAfterMouse))
	{
		System.out.println("The mouse Move action is failed");
	}
	else
	{
		System.out.println("The mouse over action is success");
	}
	
					//to click on image
	driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
	driver.findElement(By.xpath("//img[@id='j_idt88:j_idt102:j_idt104']")).click();
	
					
	
	
	
	}
	

}
