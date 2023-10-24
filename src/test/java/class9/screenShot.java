package class9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class screenShot extends CommonMethods {
    public static void main(String[] args) throws IOException {

        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApp(url, browser);

        //declare the instance
        TakesScreenshot ts=(TakesScreenshot) driver;

        //take screen shot
        File ss=ts.getScreenshotAs(OutputType.FILE);

        //then save on computer
        //adding a new folder named scrrenshot
        //adding name which abc.png
        FileUtils.copyFile(ss,new File("C:\\Users\\mdh26\\IdeaProjects\\seleniumBath17Basic\\screenshot\\abc.png"));


    }
}
