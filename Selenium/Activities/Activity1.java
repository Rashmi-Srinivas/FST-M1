import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net.");

        System.out.println("Title of the page is: "+driver.getTitle());

        WebElement element = driver.findElement(By.id("about-link"));
        element.click();

        System.out.println("Title of the new page is: "+driver.getTitle());

        driver.close();
    }
}
