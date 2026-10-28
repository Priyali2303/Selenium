package Assignement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangehrmlive {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");

		Thread.sleep(9000);


		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		Thread.sleep(3000);

		//PIM Link
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);

		//add button
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		Thread.sleep(3000);

		//upload image
		//File file =new File("C:\\Users\\Priyali\\OneDrive\\Desktop\\Testing\\Selenium.png");
		File file = new File("C:\\Users\\Priyali\\OneDrive\\Desktop\\Testing\\AlertsEx.jpg");
		WebElement filelnput= driver.findElement(By.cssSelector("input[type=file]"));
		filelnput.sendKeys(file.getAbsolutePath());

		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("priyali");
		driver.findElement(By.xpath("//input[@placeholder=\"Middle Name\"]")).sendKeys("hjhhjh");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("kjkj");
	}

}
