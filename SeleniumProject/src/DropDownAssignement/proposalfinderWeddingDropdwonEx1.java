package DropDownAssignement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class proposalfinderWeddingDropdwonEx1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://proposalfinder.com/create-wedding-profile");
		//driver.manage().window().maximize();

	Select select=new Select(driver.findElement(By.id("register-gender")));
	select.selectByVisibleText("Female");
	driver.findElement(By.id("reg-fname")).sendKeys("Priyali");
	driver.findElement(By.id("reg-lname")).sendKeys("Narsude");
	Thread.sleep(2000);

//	 Select religion = new Select(driver.findElement(By.id("cp-religion")));
//     religion.selectByVisibleText("Hindu");


	driver.findElement(By.id("tmc-dob-btn")).click();
	Select day=new Select(driver.findElement(By.id("reg-dob-day")));
	day.selectByVisibleText("23");
	Select mon=new Select(driver.findElement(By.id("reg-dob-month")));
	mon.selectByVisibleText("Mar");
	Select year=new Select(driver.findElement(By.id("reg-dob-year")));
	year.selectByVisibleText("1996");
	driver.findElement(By.id("set-dob-btn")).click();
	driver.findElement(By.id("filter-lang")).sendKeys("Marathi");
	driver.findElement(By.id("reg-mobile")).sendKeys("9503644089");
	driver.findElement(By.id("reg-email")).sendKeys("xyz@gmail.com");
	driver.findElement(By.id("reg-password")).sendKeys("12345");
	driver.findElement(By.id("tmc-search-city")).sendKeys("kop");

	Select cop=new Select(driver.findElement(By.id("reg-complexion")));
	cop.selectByVisibleText("Very Fair");

	Select height=new Select(driver.findElement(By.id("reg-height")));
	height.selectByVisibleText("5 ft 2 inch");


	}

}

