package DisableFieldAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProposalfinderWeddingProfile {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proposalfinder.com/create-wedding-profile");


		driver.findElement(By.className("basic-edit")).click();
		driver.findElement(By.id("cp-fname")).sendKeys("priyali");
		driver.findElement(By.id("cp-mname")).sendKeys("bhivaji");
		driver.findElement(By.id("cp-lname")).sendKeys("narsude");
		Thread.sleep(2000);

		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement gender=driver.findElement(By.id("cp-gender"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")", gender);
		Select s1=new Select(gender);
		s1.selectByVisibleText("Male");


		WebElement dob = driver.findElement(By.id("cp-dob"));
		js.executeScript("arguments[0].removeAttribute('disabled')", dob);
		js.executeScript("arguments[0].removeAttribute('readonly')", dob);
		dob.sendKeys("23-03-1999");

		WebElement age=driver.findElement(By.id("cp-age"));
		js.executeScript("arguments[0].removeAttribute('disabled')", age);
		js.executeScript("arguments[0].removeAttribute('readonly')", age);
		age.sendKeys("30");

		WebElement religion =driver.findElement(By.id("cp-religion"));
		js.executeScript("arguments[0].removeAttribute('disabled')", religion);
		Select rel=new Select(religion);
		rel.selectByVisibleText("Hindu");

		WebElement cast= driver.findElement(By.id("cp-caste"));
		js.executeScript("arguments[0].removeAttribute('disabled')", cast);
		Select cst=new Select(cast);
		cst.selectByVisibleText("96 Kuli");

		WebElement living= driver.findElement(By.id("cp-hc-living-together"));
		js.executeScript("arguments[0].removeAttribute('disabled')", living);
		Select live=new Select(living);
		live.selectByVisibleText("No");

		Select select =new Select(driver.findElement(By.id("cp-height")));
		select.selectByVisibleText("5 ft 2 inch");

		Select select1 =new Select(driver.findElement(By.id("cp-complexion")));
		select1.selectByVisibleText("Fair");

		Select select2 =new Select(driver.findElement(By.id("cp-diet")));
		select2.selectByVisibleText("Veg");

		driver.findElement(By.id("cp-weight")).sendKeys("55");

		WebElement gradu = driver.findElement(By.id("cp-gtype"));
		js.executeScript("arguments[0].removeAttribute('disabled')", gradu);
		Select gratype=new Select(gradu);
		gratype.selectByVisibleText("Post Graduate");

		WebElement body= driver.findElement(By.id("cp-body-type"));
		js.executeScript("arguments[0].removeAttribute('disabled')", body);
		Select bodytype=new Select(body);
		bodytype.selectByVisibleText("Average");

		WebElement blood =driver.findElement(By.id("cp-bgroup"));
		js.executeScript("arguments[0].removeAttribute('disabled')", blood);
		Select bgrp=new Select(blood);
		bgrp.selectByVisibleText("B+ve");

		WebElement HIV =driver.findElement(By.id("cp-hiv"));
		js.executeScript("arguments[0].removeAttribute('disabled')", HIV);
		Select hiv=new Select(HIV);
		hiv.selectByVisibleText("HIV Not Affected");

		WebElement challeng =driver.findElement(By.id("cp-challenged"));
		js.executeScript("arguments[0].removeAttribute('disabled')", challeng);
		Select chag=new Select(challeng);
		chag.selectByVisibleText("No");

		WebElement diseased =driver.findElement(By.id("cp-diseased"));
		js.executeScript("arguments[0].removeAttribute('disabled')", diseased);
		Select dis= new Select(diseased);
		dis.selectByVisibleText("No");

		JavascriptExecutor js12=(JavascriptExecutor) driver;
		WebElement smokeing =driver.findElement(By.id("cp-smoking"));
		js12.executeScript("arguments[0].removeAttribute('disabled')", smokeing);
		Select smok= new Select(smokeing);
		smok.selectByVisibleText("No");

		WebElement driking =driver.findElement(By.id("cp-drinking"));
		js.executeScript("arguments[0].removeAttribute('disabled')", driking);
		Select drink= new Select(driking);
		drink.selectByVisibleText("No");

		driver.findElement(By.id("cc-tmc-search-city")).sendKeys("kop");
		driver.findElement(By.id("hc-tmc-search-city")).sendKeys("sol");
		driking.findElement(By.xpath("//input[@value=\"Save\"]")).click();


		}

}
