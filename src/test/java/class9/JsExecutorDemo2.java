package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class JsExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) {

        String url="http://35.175.58.98/input-form-locator.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url, browser);

        WebElement inputBox= driver.findElement(By.xpath("//input[@id='first_name']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //trying to put a broder around it, getting it from google
        js.executeScript("arguments[0].style.border='5px solid purple'", inputBox);

        WebElement submitBtn=driver.findElement(By.xpath("//button[@id='submit_button']"));
        //using js to click
        //IMPORTANT TO KNOW--its in common metods
        js.executeScript("arguments[0].click();", submitBtn);



    }


}
