package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextEx {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");

	WebElement element=	driver.findElement(By.id("userName"));
	Actions action=new Actions(driver);

	action.keyDown(element,Keys.SHIFT).sendKeys("priyali").keyUp(Keys.SHIFT).build().perform();

	}

}
