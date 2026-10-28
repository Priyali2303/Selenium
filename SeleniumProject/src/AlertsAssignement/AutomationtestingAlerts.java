package AlertsAssignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationtestingAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");


		 driver.findElement(By.xpath("//button[contains(text(),'click the button')]")).click();
         Thread.sleep(2000);
         driver.switchTo().alert().accept();

         driver.findElement(By.linkText("Alert with OK & Cancel")).click();
         driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
         Thread.sleep(2000);
         driver.switchTo().alert().dismiss();

         driver.findElement(By.linkText("Alert with Textbox")).click();
         driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
         Thread.sleep(2000);
         driver.switchTo().alert().sendKeys("Priyali");

 		String text=driver.switchTo().alert().getText();
 		System.out.print(text);
 		Thread.sleep(2000);
 		driver.switchTo().alert().accept();
	}

}
