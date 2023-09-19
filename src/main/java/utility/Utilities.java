package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Utilities {
    //ToDo: random methods
    public static int generateRandomNumber(int lowerBound, int upperBound) {
        // Create a new instance of the Random class
        Random random = new Random();

        // Generate a random number between lowerBound and upperBound, inclusive
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        return randomNumber;
    }

    //ToDo: Capture screenshots
    public static void Capturescreenshots(WebDriver driver, String screenshotName){
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        try {
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE),new File(System.getProperty("user.dir")+"/src/test/resources"+screenshotName+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}