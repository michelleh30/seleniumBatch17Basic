package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
//        maximize the window
        driver.manage().window().maximize();


       //Task1
     //click on the first alert button and handle the alert
        //locate the click me button
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        //alter will pop up
        alert1.click();
        Thread.sleep(2000);
        //switch the focus of the driver to alert
        Alert alert = driver.switchTo().alert();//switching to the alter, this is the same one asd line 38 and 39
        alert.accept();//click ok we are accepting the alter


        Thread.sleep(3000);

        //Task 2
        //click on the thrid alter send some text there and press ok
        WebElement alter3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alter3.click();

        alert.sendKeys("I am human");
        alert.accept();
        Thread.sleep(3000);

        //task 3
        //click on button 2 and handle the alert
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();//we already have switch to alert line 27--- Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();



    }


}
