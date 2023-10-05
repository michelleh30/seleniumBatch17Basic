package class6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

        driver.get("http://gmail.com");
//        maximize the window
        driver.manage().window().maximize();
    }
}
