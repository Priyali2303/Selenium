package DatePickerAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class globalsqaDatePicker {

	static String Exp_year="2024";
	static String Exp_month="May";
	static String Exp_day ="20";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		// locate iframe
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));

		// switch to iframe
		driver.switchTo().frame(frame);

		Thread.sleep(2000);

		// click datepicker textbox
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		while(true)
		{
			String act_year=driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println(act_year);

			String act_month= driver.findElement(By.className("ui-datepicker-month")).getText();
			System.out.println(act_month);

			if(act_year.equalsIgnoreCase(Exp_year) && act_month.equalsIgnoreCase(Exp_month))
			{
				List<WebElement> datelist= driver.findElements(By.xpath("//table//tbody//tr//td"));
				for(WebElement e:datelist)
				{
					String day=e.getText();
					if(day.equals(Exp_day))
					{
						e.click();
						break;
					}
				}
				Thread.sleep(4000);
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
			}
		}

	}
}