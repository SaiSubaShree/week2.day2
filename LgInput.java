package week2.day2;

import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LgInput {

	public static void main(String[] args) throws InterruptedException 
 {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
driver.get("https://leafground.com/input.xhtml");
driver.manage().window().maximize();
			//To get the Attribute
String attribute = driver.findElement(By.id("j_idt88:name")).getAttribute("placeholder");
System.out.println("The attribute value is : " +attribute);

			//Append country
//driver.findElement(By.id("j_idt88:j_idt91")).clear();
driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("/India");
boolean enabled = driver.findElement(By.xpath("//div[@class='grid formgrid']//input[@id='j_idt88:j_idt93']")).isEnabled();
System.out.println("The Text feild result is : "+ enabled);

			//To clear the text
driver.findElement(By.id("j_idt88:j_idt95")).clear();

			//to retrive the text
String retrive = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
System.out.println("The retrived string is : "+retrive);

			//To send details and move control to next

driver.findElement(By.xpath("//div[@class='col-12']/input[@id='j_idt88:j_idt99']")).sendKeys("saisyn@gmail.com");
driver.findElement(By.xpath("//div[@class='col-12']/input[@id='j_idt88:j_idt99']")).sendKeys("\t");

			//To send the details using send keys
driver.findElement(By.xpath("//div[@class='col-12']/textarea")).sendKeys("The Details are shared as requested");

			//To select and using text Editor 
driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']/div[@class='ql-editor ql-blank']")).sendKeys("WE are going to edit the value");
String text = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']/div")).getText();
System.out.println("The text in text editor :"+ text);
WebElement findElement = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']/div"));
findElement.sendKeys(Keys.CONTROL +"A");// to select the text in text box
driver.findElement(By.xpath("//button[@class='ql-bold']")).click();

			//to press enter


driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.CONTROL.ENTER);
String errorMessage = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
System.out.println("The error message is :" +errorMessage);

			//To note the position
driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
String position = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).getAttribute("class");
System.out.println("Theh position is :" +position);
if(position.equalsIgnoreCase("ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all"))
{
	System.out.println("The lable position is not changed");
}
else
{
	System.out.println("The label position is changed");
}

driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys("sai");
Thread.sleep(5000);

driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys(Keys.CONTROL.ARROW_DOWN.ENTER);

//WebElement list = driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input"));

			// to spin the value
driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/input")).sendKeys("12");
driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a")).click();
driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-down ui-corner-br ui-button ui-widget ui-state-default ui-button-text-only']")).click();

			//to chk on slider move
driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("0");
String slide = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getAttribute("style");
System.out.println("The style is " + slide);
if(slide.equals("left: 0%;"))
{
	System.out.println("The slide is not moved");
	
}
else
{
	System.out.println("The slide is " +slide +" moved ");
}

			//To chk the keyboard value appears
driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
//String keyvalue = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).getAttribute("class");
//if(keyvalue.contains("\"ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad\""))
boolean displayed = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
if(displayed==true)
{
	System.out.println("The keypad is popped");
}
else
{
	System.out.println("The keypad is not enabled");
}

				//custom editor
driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']/div[@class='ql-editor ql-blank']")).sendKeys("Trying to edit");

//WebElement CustEditor = driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']/div[@class='ql-editor ql-blank']"));

//String edit = CustEditor.getText();
String edit = driver.findElement(By.xpath("//div[@class='ql-editor']/p")).getText();
System.out.println("The Given value before customisation " + edit);
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='ql-editor']/p")).sendKeys(Keys.CONTROL +"A");//selected the given text
driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_toolbar']//button[@class='ql-italic']")).click();
//driver.findElement(By.xpath("driver.findElement(By.xpath(\"//div[@class='ql-editor']/p")).click();



}

}
