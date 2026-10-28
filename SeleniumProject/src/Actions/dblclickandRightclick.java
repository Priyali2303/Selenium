package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dblclickandRightclick {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");

		Actions action=new Actions(driver);
		WebElement dblclick=driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(dblclick).perform();

		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightclick).perform();

	}

}
