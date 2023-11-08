import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of the page: "+driver.getTitle());

        Actions builder = new Actions(driver);
        builder.click().pause(1000).build().perform();
        String leftClickValue = driver.findElement(By.className("active")).getText();
        System.out.println("Left click value = "+leftClickValue);

        builder.doubleClick().pause(1000).build().perform();
        String doubleClickValue = driver.findElement(By.className("active")).getText();
        System.out.println("Double click value = "+doubleClickValue);

        builder.contextClick().pause(1000).build().perform();
        String rightClickValue = driver.findElement(By.className("active")).getText();
        System.out.println("Right click value = "+rightClickValue);

        driver.close();
    }
}
