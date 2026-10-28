package SeleniumBasicEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		// check the website title
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

	    //check the url

	    String url= driver.getCurrentUrl();
	    System.out.println(url);

	    //source code
	    String sourcecode =driver.getPageSource();
	    System.out.println(sourcecode);

	    // close website
	    Thread.sleep(3000);

	    driver.close();
	}
}
