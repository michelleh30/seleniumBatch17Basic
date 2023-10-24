package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {

        String url="http://35.175.58.98/upload-image.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url, browser);

        WebElement fileUpload= driver.findElement(By.xpath("//input[@id='image-file']"));
        fileUpload.sendKeys("C:\\Users\\mdh26\\OneDrive\\Desktop\\JLPhotog-1.jpg");


    }
}
