package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class ExplictWait extends CommonMethods {
    public static void main(String[] args) {
        //this is dynamic
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement enableBtnBtn= driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableBtnBtn.click();

        //click once its enable/clickable
        //I will wait until its clickable using explicit wait---//button[@id='enable_button']
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));//calling the wait
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));//condition being implanmenting

        //wait is over then the following lines will be executed
       WebElement enableBtn= driver.findElement(By.xpath("//button[text()='Button']"));
       enableBtn.click();

       //wait.until(ExpectedConditions.visibilityOfElementLocated()); used to be viable
        //wait.until(ExpectedConditions.elementToBeSelected()) wait on the element to be selected--print if its selected or not
        //wait.until(ExpectedConditions.elementToBeClickable()) wait until its visible, used for when the element is hidden
        //wait.until(ExpectedConditions.alertIsPresent()) wait for the alter to appears

        //click to alert button so alert appears
        WebElement alertBtn= driver.findElement(By.xpath("//button[@id='show_alert']"));
        alertBtn.click();

        //I need a wait for alert to be present
        wait.until(ExpectedConditions.alertIsPresent());//this wait is from line 24, we already made it so we are just calling it

        driver.switchTo().alert().accept();







    }

}
