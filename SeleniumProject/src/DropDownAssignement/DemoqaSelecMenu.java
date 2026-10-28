package DropDownAssignement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoqaSelecMenu {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/select-menu");

		driver.findElement(By.id("react-select-2-input")).sendKeys("A root option");
		driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.id("react-select-3-input")).sendKeys("Ms.");
		 driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		Select select =new Select(driver.findElement(By.id("oldSelectMenu")));
		select.selectByVisibleText("Blue");
		Thread.sleep(2000);

		driver.findElement(By.id("react-select-4-input")).sendKeys("Black");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-4-input")).sendKeys("Green");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-4-input")).sendKeys("Blue");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-4-input")).sendKeys("Red");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		Select multiple=new Select(driver.findElement(By.id("cars")));
		multiple.selectByVisibleText("Volvo");


	}

}
