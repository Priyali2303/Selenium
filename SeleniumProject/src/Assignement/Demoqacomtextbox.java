package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqacomtextbox {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		driver.findElement(By.id("userName")).sendKeys("Priyali");
		driver.findElement(By.id("userEmail")).sendKeys("priyali.narsude2303@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("kolhapur");
		driver.findElement(By.id("permanentAddress")).sendKeys("thane");
		driver.findElement(By.id("submit")).click();

		String pagetitle="demosite";
		String newtitle =driver.getTitle();
		System.out.println(newtitle);

		if (pagetitle.equalsIgnoreCase(newtitle)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}

		String url =driver.getCurrentUrl();
		System.out.println(url);

	   String sourcecode =driver.getPageSource();
	   System.out.println(sourcecode);

	   Thread.sleep(2000);
	   driver.close();


	}

}
