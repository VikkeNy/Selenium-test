import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adlibris {

    @Test
    public void testSearch() {
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.manage().window().setSize(new Dimension(1200, 800));

        driver.get("https://adlibris.com/se/");

        WebElement searchElement = driver.findElementById("q");
        searchElement.sendKeys("Praktisk mjukvarutestning");
        searchElement.submit();

        WebElement productElement = driver.findElementById("search")
                .findElement(By.className("search-result__product__name"));
        productElement.click();

        WebElement addElement = driver.findElementByClassName("product__add-to-cart");
        addElement.click();

        WebElement lookElement = driver.findElementByClassName("material-icons__shopping_cart");
        lookElement.click();

        wait.until
                (ExpectedConditions.visibilityOfElementLocated(
                        new ByChained(
                                By.className("mini-cart"),
                                By.linkText("Till kassan")
                        )
                        )
                );
        WebElement cashElement = driver.findElementByClassName("mini-cart")
                .findElement(By.linkText("Till kassan"));
        cashElement.click();
    }
}