package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tutorialspoint {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("priyali");
		driver.findElement(By.id("email")).sendKeys("priyali@gmail.com");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.id("mobile")).sendKeys("9503644089");
		driver.findElement(By.id("dob")).sendKeys("2000-05-12");
		driver.findElement(By.id("subjects")).sendKeys("marathi");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.id("picture")).sendKeys("C:\\Users\\Priyali\\OneDrive\\Desktop\\Testing\\Password.txt");
		driver.findElement(By.xpath("//textarea[@placeholder=\"Currend Address\"]")).sendKeys("Kolhapur");

		//drop down select
		WebElement state = driver.findElement(By.id("state"));

        Select st = new Select(state);

        st.selectByVisibleText("NCR");

        Thread.sleep(2000);

        WebElement city = driver.findElement(By.id("city"));

        Select cty = new Select(city);

        cty.selectByVisibleText("Agra");

        driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	}

}
