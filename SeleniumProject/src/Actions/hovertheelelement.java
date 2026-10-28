package Actions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hovertheelelement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Actions action = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		Thread.sleep(2000);

		// Hover on Account & Lists
		WebElement hover = driver.findElement(
				By.xpath("//a[@class=\"nav-a nav-a-2 nav-progressive-attribute\"]"));

		action.moveToElement(hover).perform();

		Thread.sleep(4000);

		// Click on Your Orders
		driver.findElement(By.linkText("Your Orders")).click();

	}

}
