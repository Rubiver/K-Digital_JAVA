package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Exam02 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Account ac = new Account();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.get("https://shop.interpark.com/member/login.do?_method=initial&GNBLogin=Y&&wid1=wgnb&wid2=wel_login&wid3=login&imfsUserPath=https%3A%2F%2Fshop.interpark.com%2Fmalls%2Findex.html%3FgateTp%3D1&historyGoCnt=-1");

        driver.switchTo().frame(
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginIframe")))
        );
        WebElement userId = driver.findElement(By.id("userId"));

        userId.sendKeys("123");

        System.out.println(userId);
        WebElement userPwd = driver.findElement(By.id("userPwd"));

        userPwd.sendKeys("1234");

    }
}
