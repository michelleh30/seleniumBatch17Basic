package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

        //parent frame
        driver.switchTo().frame("textfieldIframe");

        //child frame
        WebElement findCheckBox=driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(findCheckBox);
        WebElement checkBox =driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkBox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");
        //create an obj of select class
        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
       //create an object of select class
        Select sel =new Select(animals);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");
        //sending the topic
        driver.findElement(By.xpath("Topic")).sendKeys("fiahf");
    }
}
