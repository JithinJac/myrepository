package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonLibrary {
    public static WebDriver driver;

    public void openBrowser ()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }
    public void closeBrowser()
    {
          driver.quit();
    }
}
