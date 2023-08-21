package day35;

import org.checkerframework.checker.regex.qual.Regex;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Exam04 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1440,980");
        //options.addArguments("--blink-settings=imagesEnabled=false"); 이미지 로드 막음
        //자동화 성능 개선에 도움이 됨.

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://www.interpark.com/?sid1=gb&sid2=int");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"interparkMainWrap\"]/header/div[3]/div[1]/div[2]/ul/li[1]/a")));
        WebElement login_btn = driver.findElement(By.xpath("//*[@id=\"interparkMainWrap\"]/header/div[3]/div[1]/div[2]/ul/li[1]/a"));
        login_btn.click();

        System.out.println("Parent Browser : "+driver.getWindowHandle());
        String parent = driver.getWindowHandle();
        Set<String> handles =  driver.getWindowHandles();
        for(String handle : handles) {
            if (!parent.equals(handle)) {
                driver.switchTo().window(handle);
                break;
            }
        }


        WebElement inputId = driver.findElement(By.id("userId"));
        WebElement inputPwd = driver.findElement(By.id("userPwd"));
        
        inputId.sendKeys("id들어감");
        inputPwd.sendKeys("id들어감");
    }
}
