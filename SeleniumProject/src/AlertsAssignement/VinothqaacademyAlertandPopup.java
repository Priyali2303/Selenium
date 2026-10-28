package AlertsAssignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VinothqaacademyAlertandPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://vinothqaacademy.com/alert-and-popup/");

		driver.findElement(By.xpath("//button[@name=\"alertbox\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@name=\"confirmalertbox\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("yes");

		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}


