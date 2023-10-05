package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();//

        //use the driver.get() method
        driver.get("http://35.175.58.98/cssSelector.php");

        //maximiza the window
        driver.manage().window().maximize();

        //find in the profile Id
        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("michelleh");

        //fill in the profile name
        WebElement profileName = driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("hello");

        //feed bacl from jenny
        WebElement feedBackJenny= driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedBackJenny.sendKeys("website isnt working");

        //feed back from raj
        WebElement feedbackRaj= driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("website is working");

        //contains method to fill course topic
        WebElement courseTopics = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopics.sendKeys("selenium");

        //using stats with
        WebElement introToAdv= driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introToAdv.sendKeys("welcome");

         //using ends-with
        WebElement conclusion= driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("all is good");



    }
}
