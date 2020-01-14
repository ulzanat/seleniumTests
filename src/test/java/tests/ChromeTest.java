package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ChromeTest {
    @Test
    public void testPartialLink() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Search")).click();

        String expectedTitle = "Discover How Google Search Works";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
        driver.close();
        //by.linkText
        //by.partialLinkText

    }
    @Test
    public  void testSearch() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Australia"+ Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("Australia"));
        driver.close();
    }
    //driver.findElement(By.name("")).isDisplayed()
    // returns boolean
    @Test
    public  void testAmazon() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(2000);

        WebElement text = driver.findElement(By.id("hmenu-customer-name"));
        Assert.assertTrue(text.isDisplayed());
        driver.close();
    }
    @Test
    public void testTea() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.practiceselenium.com/");
        driver.findElement(By.linkText("Let's Talk Tea")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("name")).sendKeys("John");
        driver.findElement(By.name("email")).sendKeys("abc123@gmail.com");
        driver.findElement(By.name("subject")).sendKeys("special request");
        driver.findElement(By.name("message")).sendKeys("random text");
        driver.findElement(By.className("form-submit")).click();
        driver.findElement(By.xpath(""));
        

    }

}
