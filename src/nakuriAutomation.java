import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class nakuriAutomation {


    public WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Login")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//form[@name='login-form']//div/input[contains(@placeholder,'Username')]")).sendKeys("vishnumanoj71@gmail.com");
        driver.findElement(By.xpath("//form[@name='login-form']//div/input[contains(@placeholder,'password')]")).sendKeys("vishnu@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.partialLinkText("View")).click();
        driver.findElement(By.xpath("//div[@id=\"lazyResumeHead\"]//span[text()='editOneTheme']")).click();
   //     driver.switchTo().frame("resumeHeadlineForm");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@name='resumeHeadlineForm']//button")));
        driver.findElement(By.xpath("//form[@name='resumeHeadlineForm']//button")).click();
        driver.quit();
    }

    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Login")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//form[@name='login-form']//div/input[contains(@placeholder,'Username')]")).sendKeys("lincythomson10@gmail.com");
        driver.findElement(By.xpath("//form[@name='login-form']//div/input[contains(@placeholder,'password')]")).sendKeys("Lincy@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.partialLinkText("View")).click();
        driver.findElement(By.xpath("//div[@id=\"lazyResumeHead\"]//span[text()='editOneTheme']")).click();
        //     driver.switchTo().frame("resumeHeadlineForm");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@name='resumeHeadlineForm']//button")));
        driver.findElement(By.xpath("//form[@name='resumeHeadlineForm']//button")).click();
        driver.quit();

    }
}


