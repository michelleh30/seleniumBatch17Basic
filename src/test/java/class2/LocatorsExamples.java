package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();//instance

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");//get url

        driver.manage().window().maximize();//maximize the window

        WebElement userName= driver.findElement(By.id("txtUsername"));//enter the username
        userName.sendKeys("abdg123");

        Thread.sleep(2000);//its not good to use, so delete after

       userName.clear(); //clear the text box and resend the username
        userName.sendKeys("Admin");

        WebElement password= driver.findElement(By.name("txtPassword"));//to send the password
        password.sendKeys("Hum@nhrm123");

        WebElement loginBtn= driver.findElement(By.className("button"));//click on the login button
        loginBtn.click();

        WebElement welcomeMsg= driver.findElement(By.linkText("Welcome Admin"));//linktext isa the text that we find, get the text welcome admin and print on the console
        String msg= welcomeMsg.getText();
        System.out.println("the message is: "+msg);








    }
}
