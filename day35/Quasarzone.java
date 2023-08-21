package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Quasarzone {
    public static void main(String[] args) {
        //anttendanceCheck()
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.get("https://quasarzone.com/");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[1]/div[2]/div[1]/p[2]/a"))).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_id"))).sendKeys("rubiver");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("");

        js.executeScript("document.getElementById('login_id').value=arguments[0]",Account.NAVER_ID);
        js.executeScript("document.getElementById('password').value=arguments[0]",Account.NAVER_PW);

    }
}
