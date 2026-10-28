package onlineLec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		//1.X path with single attribute

		//driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("Priyali");

		//2.X path with multiple attribute

		//driver.findElement(By.xpath("//input[@placeholder='Username'][@name='user-name']")).sendKeys("priyali");

		//3.xpath with 'and' 'or' operator
		//driver.findElement(By.xpath("//input[@placeholder='Username' and @name='user-name']")).sendKeys("priyali");

		//driver.findElement(By.xpath("//input[@placeholder='Username' or @name='xyz']")).sendKeys("priyali");

		//4. xpath with text() inner text

		//driver.findElement(By.xpath("//*[text()='Swag Labs']")).click();

		//5.xpath with contains
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("Priyali");

		//6.xpath with start-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Username')]")).sendKeys("Priyali");

		//7.chianed xpath
		boolean status =driver.findElement(By.xpath("//div[@id='logo']/div/class")).isDisplayed();
		System.out.println(status);
	}


}
