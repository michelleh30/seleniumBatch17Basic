package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();//

        //use the driver.get() method
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");

        //maximiza the window
        driver.manage().window().maximize();

        WebElement checkBox1= driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox1.click();
        //if it is selected after click
        boolean selectState = checkBox1.isSelected();
        if(selectState){
            System.out.println("the check is selected");
        }else{
            System.out.println("the checkbox is not selected");
        }
        //sleect all options
        List<WebElement> checkedBoxes= driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement checkBox:checkedBoxes){
            //click on it
            checkBox.click();
        }


        //deselect option 3
        for(WebElement checkBoxAgain:checkedBoxes){//doing the loop again
            //to verify what is the option
            String option = checkBoxAgain.getAttribute("value");
            if(option.equalsIgnoreCase("Option-3")){
                checkBoxAgain.click();
            }

        }

    }
}
