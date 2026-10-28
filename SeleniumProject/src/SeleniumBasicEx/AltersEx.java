package SeleniumBasicEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AltersEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");

		// 1.accept alert -click on ok button
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//driver.switchTo().alert().accept();

		// 2.On button click - confirm box will appear
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		//3.On button click, prompt box will appear

		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Priyali");

		String text=driver.switchTo().alert().getText();
		System.out.print(text);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
