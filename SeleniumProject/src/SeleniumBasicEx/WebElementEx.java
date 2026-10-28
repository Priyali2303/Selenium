package SeleniumBasicEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementEx {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		//driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("priyali");

		WebElement fname= driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		fname.sendKeys("priyali");

		Thread.sleep(2000);
		fname.clear();

		WebElement radio=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		radio.click();

		WebElement radio1=driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		radio1.click();

		boolean selected =radio.isSelected();
		System.out.println(selected);

		boolean dispaly=radio1.isDisplayed();
		System.out.println(dispaly);

		boolean enabled=radio1.isEnabled();
		System.out.println(enabled);

	WebElement text=	driver.findElement(By.xpath(	"(//label[@class=\"checks\"])[1]"));
		String gettext=text.getText();
		System.out.println(gettext);

		String tagname=text.getTagName();
		System.out.println(tagname);

		String attribute =text.getAttribute("style");
		System.out.println(attribute);

		Dimension dimension= radio.getSize();
		System.out.println("Height :"+dimension.height +"width :"+dimension.width);

		//Thread.sleep(3000);
		WebElement submit= driver.findElement(By.id("submitbtn"));
		submit.submit();
	}

}
