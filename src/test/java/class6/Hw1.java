package class6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
goto  http://35.175.58.98/handle-iframe.php
click the checkbox
then select the  babycat
then enter topic name
 */
public class Hw1 {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/handle-iframe.php");
//        maximize the window
        driver.manage().window().maximize();
    }
}
