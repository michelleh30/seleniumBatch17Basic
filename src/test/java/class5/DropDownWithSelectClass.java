package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownWithSelectClass {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
       //maximize the window
        driver.manage().window().maximize();

        //find the drop down or locate the drop dowm
        WebElement dropDown= driver.findElement(By.xpath("//select[@id='select-demo']"));

        // create object of select and pass in the dd element
        Select sel=new Select(dropDown);

        //use any method out of index(), visibleText(), byValue() to select your desired option
        //visibleText()
        sel.selectByVisibleText("Friday");
        Thread.sleep(3000);//to see transition
        //byValue()
        sel.selectByValue("Tuesday");
        Thread.sleep(3000);//to see transition
        //index()
        sel.selectByIndex(2);

/*
       just an example to show how the getoption will work
        //getting all the options to print out
        List<WebElement> options=sel.getOptions();
        for(WebElement option:options){

            System.out.println(option.getText());//instend of saying get webelements, we want the text
            //System.out.println(option); this will get the webelement

            //I want to click on all of them
            option.click();//its really fast so you cant see it

        }

 */



    }
}
