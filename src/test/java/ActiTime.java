import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
    @Test
    public void testSearch(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 800));

        driver.get("https://actitime.com");

        WebElement headerbuttonElement = driver.findElementByClassName("header__button");
        headerbuttonElement.click();

        WebElement firstNameInput = driver.findElementById("first-name");
        firstNameInput.sendKeys("Viktor");

        WebElement lastNameInput = driver.findElementById("last-name");
        lastNameInput.sendKeys("Krum");

        WebElement emailInput = driver.findElementById("email");
        emailInput.sendKeys("HarryPotter@gmail.com");

        WebElement companyInput = driver.findElementById("company");
        companyInput.sendKeys("Hogwarts INC");
    }
}
