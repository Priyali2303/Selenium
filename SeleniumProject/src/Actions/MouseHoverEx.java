package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);

		Actions action=new Actions(driver);

		WebElement element=driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));

		action.moveToElement(element).perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[@class=\"nav-text\"])[7]")).click();

	}

}
