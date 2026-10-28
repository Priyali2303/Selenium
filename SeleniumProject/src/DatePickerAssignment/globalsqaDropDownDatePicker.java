package DatePickerAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class globalsqaDropDownDatePicker {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/demo-site/datepicker/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // click DropDown DatePicker tab
        driver.findElement(By.id("DropDown DatePicker")).click();

        Thread.sleep(2000);

        // now locate iframe
        WebElement frame = driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));

        // switch to iframe
        driver.switchTo().frame(frame);
        driver.findElement(By.className("hasDatepicker")).click();

    }
}