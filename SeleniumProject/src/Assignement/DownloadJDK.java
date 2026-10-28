package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadJDK {

	public static void main(String[] args) {

		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/#jdk26-windows");

		//driver.findElement(By.xpath("/html/body/div[1]/main/section[5]/div/div[1]/section[2]/div/div[3]/section/div/div/div/table/tbody/tr[2]/td[3]/div/a[1]")).click();
		driver.findElement(By.linkText("https://download.oracle.com/java/26/latest/jdk-26_windows-x64_bin.exe")).click();

	}

}
