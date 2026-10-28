package SeleniumBasicEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		List<WebElement> elements= driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

		for (WebElement element : elements) {
			element.click();
		}
	}

}
