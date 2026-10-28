package onlineLec;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitEx {

	public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement txtusernam=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		txtusernam.sendKeys("Admin");

		WebElement txtxpassword= myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		txtxpassword.sendKeys("admin123");

		WebElement loginbtn= myWait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-button")));
		loginbtn.click();



		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.className("oxd-button")).click();

	}

}
