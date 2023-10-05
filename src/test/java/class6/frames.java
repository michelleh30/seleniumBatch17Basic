package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/handle-iframe.php");
//        maximize the window
        driver.manage().window().maximize();

        //write down the topic
        //switch to the iframe
        driver.switchTo().frame(0);

        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("hello");

        //click on the checkbox
        //using the name or id
        driver.switchTo().frame("checkboxIframe");

        //find the webelement for check box
        WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        //select the animal baby cat from the drop down,
        driver.switchTo().defaultContent();

        WebElement frameX=driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
        //switch to the frame
        driver.switchTo().frame(frameX);

        WebElement animal= driver.findElement(By.xpath("//select[@id='animals']"));
        //create a obj of the select class
        Select sel=new Select(animal);
        sel.selectByVisibleText("Baby Cat");

    }
}
