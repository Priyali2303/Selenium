package DatePickerAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationtestingDatepicker {

	static String Exp_year="2025";
	static String Exp_month="January";
	static String Exp_day="15";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(2000);

		driver.findElement(By.id("datepicker1")).click();

		// select date 26
		Thread.sleep(2000);
		driver.findElement(By.className("ui-datepicker-year")).click();

		while(true)
		{
			String auto_year=driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println(auto_year);

			String auto_month=driver.findElement(By.className("ui-datepicker-month")).getText();
			System.out.println(auto_year);

			if(auto_year.equalsIgnoreCase(Exp_year) && (auto_month.equalsIgnoreCase(Exp_month)))
			{
				List<WebElement> datlist=driver.findElements(By.xpath("//table//tbody//tr//td"));
				for(WebElement e:datlist)
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
