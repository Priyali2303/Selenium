package SeleniumBasicEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/links");

		//driver.findElement(By.linkText("Home")).click();

		driver.findElement(By.linkText("Created")).click();
		driver.findElement(By.partialLinkText("Content")).click();

	}

}
