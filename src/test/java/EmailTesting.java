import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailTesting {

    @Test
        public void emailTesting() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://accounts.google.com/signin");
            //driver.findElement((By.className("")).click());
            driver.findElement(By.xpath("//input@[type='email']).sendKeys(ulzana26@gmail.com"));
        Thread.sleep(3000);

        driver.close();

        }
    }

