package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

/*
http://35.175.58.98/synchronization-explicit-wait.php

click to open alert and handle it

click to change text and get the changed text

click to get hidden button click on it

click to get tge checkbox selected and print if it is selected or not
 */
public class Hw1 extends CommonMethods {
    public static void main(String[] args) {

        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);//calling the method

        WebElement clickAlert= driver.findElement(By.xpath("//button[@id='show_alert']"));
        clickAlert.click();


    }
}
