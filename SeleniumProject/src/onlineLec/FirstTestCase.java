package onlineLec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {


		//1.launch browser

		WebDriver driver =new ChromeDriver();

		//2.open url https://www.saucedemo.com/

		driver.get("https://www.saucedemo.com/");

		//3.validate title should be "your store"

		String act_title=driver.getTitle();

		if(act_title.equals("your store"))
		{
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}

		//4.close browser

		//driver.close();
		driver.quit();

	}

}
