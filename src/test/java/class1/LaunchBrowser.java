package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance of the class ChromeDriver that implements Web driver interface
        WebDriver driver=new ChromeDriver();//

        //use the driver.get() method
        driver.get("https:www.google.com");//get. methods gets you to a url

        //maximize your window, making the window bigger
        driver.manage().window().maximize();

        //get the url of the Website that we open up, return type is a string
        String currentUrl=driver.getCurrentUrl();
        System.out.println("the current url is: "+currentUrl);

        //get title
        String title=driver.getTitle();
        System.out.println("the title of the page is: "+title);

        Thread.sleep(2000);//add a wait for 2sec to slow the closing of window,
        // once you are done with the code you have to delet


        //close the browser, dose it too quick
        driver.quit();

    }
}
