package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

public class Calender extends CommonMethods {

    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);//calling the method

        //find the username
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");

        //enter password
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        //find login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        //click on leave
        WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
        leave.click();

        //open the calander
        WebElement calander = driver.findElement(By.xpath("//input[@id='calFromDate']"));
        calander.click();

        //select the montm
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
//        use select class obj
        Select sel=new Select(month);
        sel.selectByVisibleText("Aug");


//        select the year
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel1=new Select(year);
        sel1.selectByVisibleText("1935");

//        get all the dates
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for(WebElement date:dates){
            String text = date.getText();

            if(text.equals("4")){//the date is 4
                date.click();
                break;
            }
        }

    }
}
