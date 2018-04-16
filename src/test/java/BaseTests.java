import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTests {

    @Test
    public void chromeTest(){

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximize");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com.ua");
        driver.quit();

    }

    @Test
    public void firefoxTest(){

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com.ua");
        driver.quit();

    }

}
