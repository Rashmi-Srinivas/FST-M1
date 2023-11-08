import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity21 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Title of the page: " + driver.getTitle());

        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent window = "+driver.getWindowHandle());

        driver.findElement(By.id("launcher")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> handles = driver.getWindowHandles();

        System.out.println("Open windows are "+driver.getWindowHandles());

        for(String handle: handles){
            if(handle!=parentHandle)
                driver.switchTo().window(handle);
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));

        System.out.println("Newly opened window title is: "+driver.getTitle());
        String heading = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div")).getText();
        System.out.println("Newly opened window heading is: "+heading);

        driver.findElement(By.id("actionButton")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        handles = driver.getWindowHandles();

        for(String handle: handles){
            if(handle!=parentHandle)
                driver.switchTo().window(handle);
        }

        Thread.sleep(3000);
        System.out.println("Newly opened window title 2nd = "+driver.getTitle());

        String newHeading = driver.findElement(By.xpath("/html/body/div[1]/div/div/div")).getText();
        System.out.println("Newly opened window 2nd heading is: "+newHeading);

        driver.quit();
    }
}
