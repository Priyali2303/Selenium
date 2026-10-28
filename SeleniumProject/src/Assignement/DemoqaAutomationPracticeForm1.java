package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoqaAutomationPracticeForm1 {

	public static void main(String[] args) {

		WebDriver driver =new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");

		driver.findElement(By.id("firstName")).sendKeys("Priyali");
		driver.findElement(By.id("lastName")).sendKeys("narsude");
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("gender-radio-2")).click();
		driver.findElement(By.id("userNumber")).sendKeys("545455655");
		//driver.findElement(By.id("dateOfBirthInput")).sendKeys("1999/03/23");
		driver.findElement(By.className("subjects-auto-complete__input-container")).sendKeys("Marathi");

	}

}
