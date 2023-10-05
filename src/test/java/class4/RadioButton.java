package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();//

        //use the driver.get() method
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");

        //maximiza the window
        driver.manage().window().maximize();

        //select the radio button--why 2 attribute? wasnt unique enough
        WebElement radioButtonMale= driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        radioButtonMale.click();

        //check if you are able to select the option or not
        boolean status=radioButtonMale.isSelected();
        if(status){
            System.out.println("the radio button male was selected");
        }else{
            System.out.println("the radio button male was not selected");
        }

        //check if the male radio button is enabled
       boolean btnEnableStatus=radioButtonMale.isEnabled();
        System.out.println("the male radio button is enabled" + btnEnableStatus);//true
        boolean btnDisplayStatus=radioButtonMale.isDisplayed();
        System.out.println("the male radio button is displayed" + btnDisplayStatus);//true

        //from the age rang 5-15
        //find all the elemetns that have all the age rang
        List<WebElement> ageRanges= driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //loop for age ranges
        for(WebElement ageRange:ageRanges) {
            //get the vaule of the attribute "value"
            String option = ageRange.getAttribute("value");
            if (option.equalsIgnoreCase("15 - 50")) {
                ageRange.click();
            }

        }

    }
}
