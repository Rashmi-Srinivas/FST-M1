import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/login-form");
        System.out.println("Title of the page: "+driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("After successful login: "+message);
        driver.close();
    }
}
