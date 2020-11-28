import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverBasics {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
        driver.get("http://selenium.dev");
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"banner-blm\"]/button")));
        WebElement closeBtn = driver.findElement(By.xpath("//*[@id=\"banner-blm\"]/button"));
        closeBtn.click();
        WebElement searchInput = driver.findElement(By.id("gsc-i-id1"));
        searchInput.sendKeys("selenium java");
        Thread.sleep(5000);
        driver.quit();

    }
}
