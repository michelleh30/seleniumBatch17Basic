package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class NextPageTask2 extends CommonMethods {
    public static void main(String[] args) {


        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);//calling the method

        //find the user name
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        //find password
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        //find the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        //click on PIM
        WebElement PIM = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PIM.click();

        // *********************task task'***************************************
        //select the check box for the employee that has an id of 357843
        //get the column id in the list
        //this will not work for any other page, just on the first page

        boolean notfound=true;//to be able to enter the loop
        //continue to execute the while loop until not found is set to false
        while(notfound) {
            //get colum list
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            // iterate
            for (int i = 0; i < idColumn.size(); i++) {//will go to the first page

                //need to get the text out of it
                String id = idColumn.get(i).getText();
                //compare if that is my desired id
                if (id.equals("61061921")) {
                    //click on the checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    notfound=false;//once found it we want it to be false, so it will break the loop
                    //get out of the loop
                    break;
                }

            }
            if(notfound) {
                //CLICK ON THE NEXT PAGE
                WebElement nextBtn= driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
        }

    }
}
