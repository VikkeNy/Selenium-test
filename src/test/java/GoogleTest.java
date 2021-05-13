import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleTest {

    @Test
    public void testSearch() throws MalformedURLException {
    WebDriver driver = new RemoteWebDriver(
            new URL("http://ec2-3-237-43-149.compute-1.amazonaws.com:4444/wd/hub"), DesiredCapabilities.chrome()
    );
    driver.manage().window().setSize(new Dimension(1200, 800));

        driver.get("https://google.com");

        WebElement searchElement = ((RemoteWebDriver) driver).findElementByName("q");
        searchElement.sendKeys("software testing");
        searchElement.submit();
    }
}
