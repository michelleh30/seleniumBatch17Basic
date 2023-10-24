package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/*
goto gmail.com
click on help
click on privacy
click on terms

switch the focus on terms page and get the title and print on screeen

then switch the focus back to the gmail page
and print the title of the main page on screen
 */
public class Hw2 {
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

        //click on term page
        WebElement termsBtn= driver.findElement(By.xpath("//a[text()='Terms']"));

        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();

        //how to get the main page handle, save if in a varibale
      String mainPageHandle=driver.getWindowHandle();

      //get all handles
        Set<String>allHandles=driver.getWindowHandles();

        for(String handle:allHandles){
            driver.switchTo().window(handle);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }

        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


    }

}
