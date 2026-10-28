package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationtestingRegister {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Priyali");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Narsude");

		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("kolhapur");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("priyali@gmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
        driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
        driver.findElement(By.id("checkbox2")).click();

        // drop down select the data  not working
//      WebElement lang=  driver.findElement(By.id("msdd"));
//    		 lang .click();
//      Select langSelect=new Select(lang);
//      langSelect.selectByVisibleText("English");

      Select select=new Select(driver.findElement(By.id("Skills")));
      select.selectByVisibleText("APIs");

      Select year=new Select(driver.findElement(By.id("yearbox")));
      year.selectByVisibleText("1999");

      Select mon=new Select(driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")));
      mon.selectByVisibleText("March");

      driver.findElement(By.id("firstpassword")).sendKeys("123");
      driver.findElement(By.id("secondpassword")).sendKeys("123");
      driver.findElement(By.id("submitbtn")).click();



	}

}
