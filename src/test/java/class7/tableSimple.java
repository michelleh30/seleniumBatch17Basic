package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class tableSimple extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/table-data-download-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        // get the whole table
        //*****************table level access*****************  meaning printing rows and colums

        WebElement allTable = driver.findElement(By.xpath("//table[@id='example']"));
        String tableContent = allTable.getText();//getting the text from the table
        //System.out.println(tableContent);
        //****************** row level access ********************
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        //want to print all the rows
        //when ever theres a list of webelement we need to get the text//attributes out of it

        for (WebElement row : rows) {
            String text = row.getText(); //line 26
            //print out only software enginner
            if (text.contains("Software Engineer")) {
                //System.out.println(text);
            }
        }
//************** column level access ********************************************
        //we can isolate the table and fouce on one exact cell
        //printing all the colums
        List<WebElement> columns= driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
        //need to extract all the text
        for(WebElement column :  columns){
           String text= column.getText();
            System.out.println(text);
        }
//**************************** Task ***************************
        //1. locate the colum that contains postion
        List<WebElement> positions = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
        //2nd colums

        int i=0;
        for(WebElement position:positions){
            String text=position.getText();

            if(text.equals("Software Engineer")) {

                System.out.println("the row number in which software eng is presnet is" + i);
                WebElement row = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + (i + 1) + "]"));
                System.out.println(row.getText());
            }

        }
        i=i+1;


    }
}
