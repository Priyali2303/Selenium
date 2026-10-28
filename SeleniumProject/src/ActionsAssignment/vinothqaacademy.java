package ActionsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vinothqaacademy {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");

		//double click
		Actions action=new Actions(driver);
		WebElement dblclick=driver.findElement(By.id("doubleBtn"));
		action.doubleClick(dblclick).perform();
		Thread.sleep(2000);

		//right click
		WebElement rightclick=driver.findElement(By.id("rightBtn"));
		action.contextClick(rightclick).perform();
		Thread.sleep(2000);

		//drag and drop
		WebElement sourc=driver.findElement(By.id("dragItem"));
		WebElement destination=driver.findElement(By.id("dropZone"));
		Thread.sleep(2000);
		action.dragAndDrop(sourc, destination).perform();

		//tool tip
		WebElement element=driver.findElement(By.id("tooltipTarget"));
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		String tooltip=element.getAttribute("title");
		System.out.println(tooltip);

		//silder
		WebElement slider = driver.findElement(By.id("handle-max"));
		action.dragAndDropBy(slider, 200, 0).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(slider, -100, 0).perform();



	}

}
