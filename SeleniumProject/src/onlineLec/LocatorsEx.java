package onlineLec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		//driver.get("https://www.flipkart.com/");



		driver.manage().window().maximize();

		//1.name

		//driver.findElement(By.name("user-name")).sendKeys("Priyali");

		//2.id

		boolean usernameid=driver.findElement(By.id("user-name")).isDisplayed();
	    System.out.println(usernameid);

	    //3.linktext and paritallinktext

	    //driver.findElement(By.linkText("Tablets")).click();
	   // driver.findElement(By.partialLinkText("Tab")).click();

	    //4.class name
	   List<WebElement> headerLinks=driver.findElements(By.className("login_wrapper-inner"));
	   System.out.println("total number of links :" +headerLinks.size());



	    }

}
