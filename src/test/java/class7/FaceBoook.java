package class7;
//implict wait are golbal wirte on top
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.time.Duration;

import static utils.CommonMethods.openBrowserAndLaunchApp;

public class FaceBoook extends CommonMethods {
    public static void main(String[] args) {

        String url="http://www.facebook.com";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);//calling the method


        //        find the button create new account
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();

//        fill in the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("moazzam");

    }
}

