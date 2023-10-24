package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class ActionClass2 extends CommonMethods {
    public static void main(String[] args) {

        String url="https://demo.guru99.com/test/simple_context_menu.html";
        String browser="chrome";
        openBrowserAndLaunchApp(url, browser);

        WebElement rightClick= driver.findElement(By.xpath("//span[text()='right click me']"));
        //how to right click
       Actions action= new Actions(driver);
       action.contextClick(rightClick).perform();

       //try to see if you can click on one of the opions





    }
}
