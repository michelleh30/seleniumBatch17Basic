package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookEx {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();//instance

        driver.get("https://www.facebook.com");//go to fb

        driver.manage().window().maximize();//make bigger

        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("mdh2626@hotmail.com");

        WebElement password= driver.findElement(By.name("pass"));
        password.sendKeys("pass123");

        WebElement login= driver.findElement(By.name("login"));
        login.click();

    }
}
