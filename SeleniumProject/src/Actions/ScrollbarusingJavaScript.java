package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbarusingJavaScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in/");

		Thread.sleep(4000);

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		//scroll vertically down by pixcel
		Thread.sleep(5000);

		//scroll up
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(4000);

		WebElement element=driver.findElement(By.linkText("Demo Dropdown List"));

		//scroll till visibilty of web elelment
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(5000);

		//scroll down the webpage at the bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);

		//scroll by horizontally
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(4000);

		//scroll up the webpage at the up of the page
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}

}
