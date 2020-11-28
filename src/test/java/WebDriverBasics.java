import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://selenium.dev");
        WebElement closeBtn = driver.findElement(By.xpath("//*[@id=\"banner-blm\"]/button"));
        closeBtn.click();
        WebElement searchInput = driver.findElement(By.id("gsc-i-id1"));
        searchInput.sendKeys("selenium java");
        Thread.sleep(5000);
        driver.quit();

    }
}
