package onlineLec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		//1.tag id  (input id tag and user-name is id) = tag#id
		//driver.findElement(By.cssSelector("input#user-name")).sendKeys("Priyali");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("Priyali");

		//2.tag class (tag.classname)

		//driver.findElement(By.cssSelector("input.input_error")).sendKeys("priyali");
		//driver.findElement(By.cssSelector(".input_error")).sendKeys("priyali");

		//3.tag attribute    tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("priyali");
		//driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("priyali");

		//4.tag class attribute

		//driver.findElement(By.cssSelector("input.input_error[placeholder='Username']")).sendKeys("priyali");
		driver.findElement(By.cssSelector(".input_error[placeholder='Username']")).sendKeys("priyali");
	}

}
