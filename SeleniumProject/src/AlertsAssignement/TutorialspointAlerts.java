package AlertsAssignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TutorialspointAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

		driver.findElement(By.xpath("//button[@onclick=\"showAlert()\"]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

//		driver.findElement(By.xpath("//button[@onclick=\"myMessage()\"]")).click();
//		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@onclick=\"myDesk()\"]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//button[@onclick=\"myPromp()\"]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("hii");

		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}

}
