package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();//instance

        driver.get("http://35.175.58.98/input-form-locator.php");//navigate to website

        driver.manage().window().maximize();//maximize the window

        WebElement firstName= driver.findElement(By.id("first_name"));//locate the WebElement first name
        firstName.sendKeys("michelle");//enter the data you want,use send keys to send the data tp webelement

        WebElement lastName= driver.findElement(By.name("last_name"));//locate the webElement last name
        lastName.sendKeys("hurtado");

        WebElement email= driver.findElement(By.className("form-control-01"));//locate WebElement email
        email.sendKeys("mdh2626@hotmail.com");

        WebElement submitBtn =driver.findElement(By.tagName("button"));//locate and click on it
        submitBtn.click();

        WebElement linkBtn= driver.findElement(By.linkText("Link"));//locate the WebElement LINK
        linkBtn.click();

        WebElement clickHere = driver.findElement(By.partialLinkText("Here."));//locate the webElement click here using partial link text

        clickHere.click();
    }
}
