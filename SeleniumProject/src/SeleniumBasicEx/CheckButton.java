package SeleniumBasicEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.id("checkbox1")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("checkbox3")).click();

	}

}
