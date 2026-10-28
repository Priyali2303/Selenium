package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleDropDownDatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");

		//select year
		driver.findElement(By.id("datepicker2")).click();
		Select year = new Select(driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[2]")
		));
		Thread.sleep(2000);
		year.selectByVisibleText("2020");

		//select month

		Select month= new Select(driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[1]")));
		Thread.sleep(2000);
		month.selectByVisibleText("March");

		//select date
		Thread.sleep(2000);
		driver.findElement(By.linkText("23")).click();


	}

}
