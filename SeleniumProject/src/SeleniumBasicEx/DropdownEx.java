package SeleniumBasicEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		Select select =new Select(driver.findElement(By.id("oldSelectMenu")));
		select.selectByVisibleText("Red");
		Thread.sleep(2000);
		select.selectByValue("4");
		Thread.sleep(2000);
		select.selectByIndex(7);

		Select multiple=new Select(driver.findElement(By.id("cars")));
		multiple.selectByVisibleText("Volvo");
		multiple.selectByValue("saab");
		multiple.selectByIndex(3);

		Thread.sleep(2000);
		multiple.deselectAll();
		//multiple.deselectByIndex(1);

	}

}
