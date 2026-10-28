package SeleniumBasicEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadUploadFile {

	public static void main(String[] args) {

		WebDriver driver =new FirefoxDriver();
		driver.get("https://demoqa.com/upload-download");

		driver.findElement(By.id("downloadButton")).click();
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Priyali\\OneDrive\\Desktop\\Testing\\Password.txt");

	}

}
