package class7;
// print the row with position Software engineer without using contain method
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

import static utils.CommonMethods.driver;

public class tableSimpleTask1 extends CommonMethods {
    public static void main(String[] args) {

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
            i=i+1;

        }


    }
}
