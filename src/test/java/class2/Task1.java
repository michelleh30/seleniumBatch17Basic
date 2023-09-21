package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Automating a Login Process
Objective: Write a Selenium script to automate the login process on the OrangeHRM website.
Instructions:

Go to the OrangeHRM login page: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Enter the username "abc".
Clear the username field.
Enter the username "Admin".
Enter the password "admin123".

Get the text from the login button web element and print it on the console.
Click on the login button.(I don't get this)

 */
public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        Thread.sleep(6000);

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("abc");
        userName.sendKeys(Keys.CONTROL + "a");
        userName.sendKeys(Keys.DELETE);
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginBtn =driver.findElement(By.tagName("button"));
        loginBtn.click();














    }
}
