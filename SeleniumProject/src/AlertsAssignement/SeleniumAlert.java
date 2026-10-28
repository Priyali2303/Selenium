package AlertsAssignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");

		driver.findElement(By.linkText("click me")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("empty-alert")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hi");
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("prompt-with-default")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("hii");
		String pro=driver.switchTo().alert().getText();
		System.out.println(pro);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("double-prompt")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("hii");
		String dob=driver.switchTo().alert().getText();
		System.out.println(dob);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().sendKeys("hii");
		String dob1=driver.switchTo().alert().getText();
		System.out.println(dob1);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("slow-alert")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		driver.findElement(By.id("alertInFrame")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
