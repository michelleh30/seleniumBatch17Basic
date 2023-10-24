package class7;
//somethihing like this for hw
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        //this is dynamic, more readable
        String url="http://35.175.58.98/synchronization-waits.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);//calling the method
        //closeBroswer();

        //find the button and click it
        WebElement button1= driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        button1.click();

        //get the text that appare
        //get the text
        WebElement text1 = driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
        String text = text1.getText();
        System.out.println(text);

        //the 2 other waits are hw


    }
}
