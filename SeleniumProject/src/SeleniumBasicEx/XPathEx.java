package SeleniumBasicEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathEx {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("nbdfnm");

		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("lastname");

		driver.findElement(By.linkText("//input[@placeholder=\"Last name\"]")).sendKeys("");

	}


}
