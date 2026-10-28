package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParabankParasoft {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://parabank.parasoft.com");

		driver.manage().window().maximize();



		String title="ParaBank | Welcome | Online Banking";
		String  newtitle=driver.getTitle();
System.out.println(newtitle);

		if (title.equalsIgnoreCase(newtitle)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}

		String url =driver.getCurrentUrl();
		System.out.println(url);

	   String sourcecode =driver.getPageSource();
	   System.out.println(sourcecode);

	 driver.findElement(By.name("username")).sendKeys("priyali");
	 driver.findElement(By.name("password")).sendKeys("priyali@123");
	 Thread.sleep(2000);
	 driver.findElement(By.className("button")).click();

	 driver.findElement(By.linkText("Register")).click();
	 driver.findElement(By.id("customer.firstName")).sendKeys("priyali");
	 driver.findElement(By.id("customer.lastName")).sendKeys("narsude");
	 driver.findElement(By.id("customer.address.street")).sendKeys("rukadi");
	 driver.findElement(By.name("customer.address.city")).sendKeys("kolhapur");
	 driver.findElement(By.name("customer.address.state")).sendKeys("maharastra");
	 driver.findElement(By.name("customer.address.zipCode")).sendKeys("416118");
	 driver.findElement(By.id("customer.phoneNumber")).sendKeys("9503644089");
	 driver.findElement(By.id("customer.ssn")).sendKeys("22222");
	 driver.findElement(By.name("customer.username")).sendKeys("priyali");
	 driver.findElement(By.name("customer.password")).sendKeys("priyali@123");
	 driver.findElement(By.name("repeatedPassword")).sendKeys("priyali@123");
	Thread.sleep(2000);
	 driver.findElement(By.className("button")).click();

	   //Thread.sleep(2000);
	   //driver.close();

	}

}
