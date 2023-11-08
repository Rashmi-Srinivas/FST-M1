import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        System.out.println("Title of the page: "+driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr"));
        System.out.println("No of rows = "+rows.size());

        List<WebElement> cols = driver.findElements(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td"));
        System.out.println("No of columns = "+cols.size());

        List<WebElement> cellValues = driver.findElements(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr[3]/td"));
        System.out.println("3rd row cell values are: ");

        for(WebElement test:cellValues)
            System.out.println(test.getText());

        WebElement cellValue = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr[2]/td[1]"));
        System.out.println("2nd row 1st col cell value = "+cellValue.getText());

        driver.close();
    }
}
