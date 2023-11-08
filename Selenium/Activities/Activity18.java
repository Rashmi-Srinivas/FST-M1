import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity18 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/selects");
        System.out.println("Title of the page: "+driver.getTitle());

        WebElement dropdown = driver.findElement(By.id("multi-select"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Javascript");

        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);

        select.selectByValue("node");

        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println("Selected options are: ");

        for(WebElement option: selectedOptions)
            System.out.println(option.getText());

        select.deselectByIndex(4);

        selectedOptions = select.getAllSelectedOptions();
        System.out.println("Selected options are: ");

        for(WebElement option: selectedOptions)
            System.out.println(option.getText());

        driver.close();

    }
}
