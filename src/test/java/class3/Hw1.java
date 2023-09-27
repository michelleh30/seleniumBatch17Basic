package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        //use the driver.get() method
        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        //find the textbox and fill in you full name
        WebElement fullName= driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Michelle Hurtado");

        //send email
        WebElement Email= driver.findElement(By.xpath("//input[@id='userEmail']"));
        Email.sendKeys("michelle@gmail.com");

        //send address
        WebElement Address= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        Address.sendKeys("6123 Vista Dr");

        //send 2nd address
        WebElement Address2= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        Address2.sendKeys("6124 Hello Ln");

        WebElement button= driver.findElement(By.xpath("//button[@id='submit']"));
        button.click();







    }
}
