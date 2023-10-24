package class8;
//sleect the date from calander "5th Dec 1998"
//
//http://35.175.58.98/jquery-date-picker-demo.php
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class Hw2 extends CommonMethods {
    public static void main(String[] args) {

        String url="http://35.175.58.98/jquery-date-picker-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url, browser);

        //click on the calendar
        WebElement calander= driver.findElement(By.xpath("//input[@id='from']"));
        calander.click();





    }
}
