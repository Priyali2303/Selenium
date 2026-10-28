package DatePickerAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoqaDatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		Thread.sleep(2000);

		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		Thread.sleep(2000);
		year.selectByVisibleText("2020");

		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		Thread.sleep(2000);
		month.selectByVisibleText("March");

		Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='23']")).click();

		  driver.findElement(By.id("dateAndTimePickerInput")).click();
		  driver.findElement(By.className("react-datepicker__year-read-view")).click();

	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[text()='2030']")).click();

	        driver.findElement(By.className("react-datepicker__month-read-view")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[text()='March']")).click();

	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[text()='15']")).click();

	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//li[text()='06:30']")).click();
	}

}
