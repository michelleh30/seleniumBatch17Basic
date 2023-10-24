package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

/*
goto http://35.175.58.98/table-pagination-demo.php


print the rows that have status  "in progress"

no use of conatins method allowed
why? it can change if using contain method
 */
public class Hw3 extends CommonMethods {
    public static void main(String[] args) {

        String url="http://35.175.58.98/table-search-filter-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);//calling the method

        //locate the column status
        List<WebElement> statuses = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));

        /*
        for (int i = 0; i < statuses.size(); i++) {
            String currentStatus = statuses.get(i).getText();
            if (currentStatus.equals("in progress")) {
                System.out.println("The row number which has in progress is " + i);
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + (i+1) + "]"));
                System.out.println(row.getText());
            }

        }

        different way of writing code using for
         */
        int i=0;

        for(WebElement status: statuses){
            String text= status.getText();
            if(text.equals("in progress")){
                WebElement row= driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + (i+1) + "]"));
                System.out.println(row.getText());

            }i++;
        }




    }
}
