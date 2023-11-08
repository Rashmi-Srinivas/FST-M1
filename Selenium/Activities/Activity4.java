import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/target-practice");
        System.out.println("Title of the page: "+driver.getTitle());
        String thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third header===== "+thirdHeader);
        String color = driver.findElement(By.xpath("//h5[contains(text(), 'Fifth header')]")).getCssValue("color");
        System.out.println("Color===== "+color);
        String violet = String.valueOf(driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class"));
        System.out.println("Violet classes are ===== "+violet);
        String greyText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println("Grey text ===== "+greyText);
        driver.close();
    }
}
