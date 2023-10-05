package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AYZoVheraxUtkcKtAehg0ImoQe7KCM3xkeqf7wKjeY6xRXrRMOad8xpBiSfLXba4MbPLY1XA4L0hHg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S185139128%3A1696468134826943&theme=glif");
//        maximize the window
        driver.manage().window().maximize();

        //click on help
        WebElement helpBtn= driver.findElement(By.xpath("//a[text()='Help']"));

        //click on privacy
        WebElement privacyBtn= driver.findElement(By.xpath("//a[text()='Privacy']"));

        helpBtn.click();
        privacyBtn.click();

        //task 1
        String gmailHandle= driver.getWindowHandle();
        System.out.println(gmailHandle);

        //task2
        //swutch the fouce of yhour webdriver to the privacy window
        // get all the handles and find the desired one
        Set<String> allHandles=driver.getWindowHandles();

        //loop through all the handle and find the one that is desired
        for (String handles:allHandles){
            driver.switchTo().window(handles);
            //ge the title of the window on which the fouce is
            String title= driver.getTitle();
            //check if the title
            if (title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){

                break;//breaks the loop if condition is true, break end the for loop
            }

        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
