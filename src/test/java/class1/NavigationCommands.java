package class1;
//get doesnt let you go farward or backward
//driver.navigate does let you refresh, go backward or forward
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
//
        driver.get("https:google.com");//going to google

        driver.manage().window().maximize();//make the screen bigger

        Thread.sleep(2000);//slow down the process

        driver.navigate().to("https://www.facebook.com");//go to fb,

        Thread.sleep(2000);//for it to slow down

        driver.navigate().back();//go back

        Thread.sleep(2000);//for it to slow down

        driver.navigate().forward();//going forward

        driver.navigate().refresh();

        driver.close();//or

        //driver.quit();




    }
}
