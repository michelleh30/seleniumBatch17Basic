package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

/*
http://35.175.58.98/synchronization-waits.php

click on click me button and get the text and print on screen
 */
public class Hw2 extends CommonMethods {
    public static void main(String[] args) {

        String url="http://35.175.58.98/synchronization-waits.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);//calling the method

        WebElement clickMeBtn= driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        clickMeBtn.click();

        WebElement text= driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
        System.out.println(text.getText());




    }
}
