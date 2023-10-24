package class9;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import utils.CommonMethods;

public class JsExecutor extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://35.175.58.98/simple_context_menu.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url, browser);

        //we want to scroll down
        //declear the instance
        JavascriptExecutor Js=(JavascriptExecutor)driver;
        Js.executeScript("window.scrollBy(0, 500)");

        Thread.sleep(2000);
        Js.executeScript("window.scrollBy(0,-500)");//will scroll up




    }
}
