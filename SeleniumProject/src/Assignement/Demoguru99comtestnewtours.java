package Assignement;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoguru99comtestnewtours {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/");

		String pagetitle="Welcome: Mercury Tours";
		String newtitle =driver.getTitle();
		System.out.println(newtitle);

		if (pagetitle.equalsIgnoreCase(newtitle)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}


		String url = driver.getCurrentUrl();
		System.out.println(url);

		String sourcecode =driver.getPageSource();
		System.out.println(sourcecode);

		//driver.findElement(By.id("userName")).sendKeys("priyali");
		//driver.findElement(By.id("password")).sendKeys("priyali@123");




		 Thread.sleep(2000);
		   driver.close();

	}

}
