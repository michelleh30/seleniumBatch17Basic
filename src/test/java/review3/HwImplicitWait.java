package review3;
// first hr explain
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class HwImplicitWait extends CommonMethods {
    public static void main(String[] args) {

        String url="http://35.175.58.98/synchronization-waits.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);//calling the method

        WebElement button2 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        button2.click();
//        the implicit wait is already implemented in the common Methods
//        find the radioButton
        WebElement radioBtn = driver.findElement(By.xpath("//input[@value='Male']"));
        radioBtn.click();




    }
}
