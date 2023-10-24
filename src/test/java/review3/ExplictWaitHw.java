package review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class ExplictWaitHw extends CommonMethods {
    public static void main(String[] args) {

        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);//calling the method

        WebElement clickCheckBoxBtn= driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        clickCheckBoxBtn.click();
        //wait until the cheeck is selected
        //then get the state of the check box

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
        //check to see if its true or false
        boolean stateOfCheckBox= driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected();
        System.out.println(stateOfCheckBox);

        //click on the button to change text
        WebElement changeTextBtn = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeTextBtn.click();

        //whe
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Ssyntaxtechs']")));

        //when its visible, find the text and print
        String text=driver.findElement(By.xpath("//h2[text()='Ssyntaxtechs']")).getText();
        System.out.println(text);


    }
}
