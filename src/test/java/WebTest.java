import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTest {

    @Test
    public void testFirst() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        String actualResult = driver.getCurrentUrl();

        driver.close();
        driver.quit();
    }

    @Test
    public void testVerifyHeaderText() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer ";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        String actualResult = driver.getTitle();

        driver.close();
        driver.quit();
    }
}
