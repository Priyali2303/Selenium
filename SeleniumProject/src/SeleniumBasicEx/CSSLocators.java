package SeleniumBasicEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");

		//tag and class; for class used . sign
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("priyali");

		// tag and id for id used the # sign
		driver.findElement(By.cssSelector("input#userName")).sendKeys("narsude");

		// tag and attribute for attribute used the [] sign
		driver.findElement(By.cssSelector("textarea[placeholder=\"Current Address\"]")).sendKeys("Thane");

		//tag,class and attribute
		driver.findElement(By.cssSelector("textarea.form-control[id=\"permanentAddress\"]")).sendKeys("Thane");
	}

}
