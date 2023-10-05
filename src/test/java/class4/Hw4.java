package class4;
/*
Check if the "Female" radio button is displayed.
Click on the "Show Button".
Check again if the "Female" radio button is displayed or not.
Print the results of the checks to the console.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw4 {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();//

        //use the driver.get() method
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php.");

        //maximiza the window
        driver.manage().window().maximize();
    }
}
