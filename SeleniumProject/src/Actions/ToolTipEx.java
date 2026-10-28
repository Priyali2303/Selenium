package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

abstract class ToolTipEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");

		WebElement element=driver.findElement(By.id("tooltipTarget"));

		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		Thread.sleep(2000);
		String tooltip=element.getAttribute("title");
		System.out.println(tooltip);


	}

}
