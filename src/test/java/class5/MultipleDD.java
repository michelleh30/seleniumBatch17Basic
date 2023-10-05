package class5;
/*
drop down
1. find the select tap
2. creat an obj, passing the value
3. use methods ex. by visible text etc
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDD {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
//        maximize the window
        driver.manage().window().maximize();

//        find the drop down
        WebElement multidropDown= driver.findElement(By.xpath("//select[@id='multi-select']"));

        //create an obj of select class
        Select sel=new Select(multidropDown);

        // select visble text
        sel.selectByVisibleText("Texas");

        //select bu value
        sel.selectByValue("Florida");

        Thread.sleep(3000);

        //deselect
       sel.deselectByVisibleText("Texas");

        //check weather the dd is mutiselect or not
        System.out.println(sel.isMultiple());//boolean--true

       System.out.println(sel.getOptions());//get the available options




//

    }
}
