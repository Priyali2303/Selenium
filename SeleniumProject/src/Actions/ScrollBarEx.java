package Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollBarEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in/");

		Thread.sleep(4000);

		Actions action= new Actions(driver);
		action.keyDown(Keys.PAGE_DOWN).perform();

		Thread.sleep(4000);
		action.keyDown(Keys.PAGE_DOWN).perform();

		Thread.sleep(4000);
		action.keyDown(Keys.PAGE_UP).perform();

		Thread.sleep(4000);
		action.keyDown(Keys.END).perform();

		Thread.sleep(4000);
		action.keyDown(Keys.HOME).perform();

	}

}
