package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerofNextButtonEx {

	static String Exp_year="2022";
	static String Exp_month="January";
	static String Exp_day="26";


	public static void main(String[] args) throws InterruptedException {

		//select date
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range\r\n");

		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();

		while(true)
		{
			String act_year= driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println(act_year);

			String act_month= driver.findElement(By.className("ui-datepicker-month")).getText();
			System.out.println(act_month);

			if(act_year.equalsIgnoreCase(Exp_year) && (act_month.equalsIgnoreCase(Exp_month)))
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
