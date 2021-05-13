import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleTest {

    @Test
    public void testSearch() throws MalformedURLException {
    ChromeDriver driver = new ChromeDriver();

    driver.manage().window().setSize(new Dimension(1200, 800));

        driver.get("https://google.com");

        WebElement searchElement = ((ChromeDriver) driver).findElementByName("q");
        searchElement.sendKeys("software testing");
        searchElement.submit();
    }
}
