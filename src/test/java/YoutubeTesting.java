import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTesting {
    @Test
    public void YoutubeTesting() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.youtube.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("miracle"+ Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Caravan Palace - Miracle")).click();
        Thread.sleep(10000);
        driver.close();

    }
}



