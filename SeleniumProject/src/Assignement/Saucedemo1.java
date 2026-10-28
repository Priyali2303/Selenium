package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Saucedemo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		String extTitle= "Swag Labs";
	    String ActTitle= driver.getTitle();
	    System.out.println(ActTitle);

	    if(extTitle.equalsIgnoreCase(ActTitle))
	    {
	    	System.out.println("test passed");
	    }
	    else {
	    	System.out.println("test failed");
		}

	    String url= driver.getCurrentUrl();
	    System.out.println(url);

	    String sourcecode =driver.getPageSource();
	    System.out.println(sourcecode);

	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(3000);

		driver.findElement(By.className("inventory_item_img")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("priyali");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("narsude");
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("416118");
		Thread.sleep(2000);
		driver.findElement(By.className("submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("back-to-products")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

	   driver.close();

	}

}
