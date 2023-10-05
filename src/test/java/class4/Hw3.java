package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
How I did it---correct way hw 3 review class

Check the state of Checkbox1 is enabled
If Checkbox1 is disabled:
Click on the "enable checkboxes" button.
Verify that Checkbox1 is now enabled.
Click on Checkbox1.
Confirm that Checkbox1 is selected.
 */
public class Hw3 {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();//

        //use the driver.get() method
        driver.get("http://35.175.58.98/basic-checkbox-demo.php.");

        //maximiza the window
        driver.manage().window().maximize();

        //Check the state of Checkbox1 is enabled--
        // we are doing the loop to check all, have to get a name that they all share
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        for (WebElement checkbox : checkboxes) {
            String option = checkbox.getAttribute("value");
            if (option.equalsIgnoreCase("Checkbox-1")) {
                boolean state = checkbox.isEnabled();
                System.out.println(state);
                //If Checkbox1 is disabled:



            }
        }


    }
}
