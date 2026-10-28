package WaitEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitlyWaitEx2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		// Explicit wait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));

		// Textbox 1
		driver.findElement(By.id("btn1")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		driver.findElement(By.id("txt1")).sendKeys("text1");

		// Textbox 2
		driver.findElement(By.id("btn2")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		driver.findElement(By.id("txt2")).sendKeys("text2");

	}
}