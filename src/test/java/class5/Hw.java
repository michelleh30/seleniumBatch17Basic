package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
slect your dream destination from this calander
http://35.175.58.98/no-select-tag-dropdown-demo.php

cause that drop down did not have select tag

Cant use the select path bcuz there is not select path
like checkboxes
 */
public class Hw {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        //maximize the window
        driver.manage().window().maximize();

        //find the drop down or locate the drop dowm
        WebElement dreamCountry= driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));
        dreamCountry.click();

        WebElement countyPick=driver.findElement(By.xpath("//a[contains(text(),'Iceland')]"));
        countyPick.click();














    }
}
