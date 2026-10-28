package DatePickerAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99DatePicker {

	public static void main(String[] args) {

		 WebDriver driver = new ChromeDriver();

	        driver.get("https://demo.guru99.com/test");
	        driver.manage().window().maximize();

	        // locate datetime-local input
	        driver.findElement(By.xpath("//input[@type='datetime-local']"))
	              .sendKeys("2026-05-26T20:30");
	}

}
