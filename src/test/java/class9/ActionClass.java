package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class ActionClass extends CommonMethods {

    public static void main(String[] args) {

        String url="http://35.175.58.98/simple_context_menu.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url, browser);

        WebElement hover = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action=new Actions(driver);
        action.moveToElement(hover).perform();

    // *******************************************************************************
        // DRAG AND DROP

        //drag
        WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));

        //drop
        WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
        //need action class to do the action
        //action.dragAndDrop(drag,drop).perform();//its doing the actions

        //3 different method from the same class
        //need .build to combine all 3 methods
        //Whenever we are chaining more than 1 method in action class we have to use build() and perform();
        action.clickAndHold(drag).moveToElement(drop).release().build().perform();




    }
}
