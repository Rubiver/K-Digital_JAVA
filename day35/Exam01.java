package day35;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Exam01 {
    public static void main(String[] args) throws Exception{
        //System.setProperty("webdriver.chrom.driver","chromdriver.exe"); webDriver를 못잡는 경우 주석해제, 현재는 오류발생하지 않음.
        WebDriver driver = new ChromeDriver();
        Account ac = new Account();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.get("https://www.naver.com/");
        //WebElement we = driver.findElement(By.id("query"));
        //System.out.println(we);
        //we.click();

//      List<WebElement> btns = driver.findElements(By.className("link_login"));
        WebElement btns = driver.findElement(By.className("MyView-module__link_login___HpHMW"));
        btns.click();

        WebElement id = driver.findElement(By.id("id"));
        //id.sendKeys(ac.NAVER_ID);
        js.executeScript("document.getElementById('id').value=arguments[0]",Account.NAVER_ID);
        WebElement pw = driver.findElement(By.id("pw"));
        //pw.sendKeys(ac.NAVER_PW);
        js.executeScript("document.getElementById('pw').value=arguments[0]",Account.NAVER_PW);

        WebElement login_btn = driver.findElement(By.id("log.login"));
        login_btn.click();

        driver.get("https://mail.naver.com/v2/folders/0/all");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("button_write_to_me")));
        //wait until은 0.5초마다 해당 요소를 찾음. for문 돌리면 시간간격을 줄일 수 있음.
        WebElement writeToMe = driver.findElement(By.className("button_write_to_me"));
        writeToMe.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subject_title")));
        WebElement inputTitle = driver.findElement(By.id("subject_title"));
        inputTitle.sendKeys("hi");

//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[tabindex='5'")));
//        WebElement iframe = driver.findElement(By.cssSelector("iframe[tabindex='5'"));

        driver.switchTo().frame(
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[tabindex='5'")))
        );
//        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
//        for(WebElement iframe : iframes){
//            System.out.println(iframe.getAttribute("tabindex"));
//            String result = iframe.getAttribute("tabindex");
//            if(result != null){
//                driver.switchTo().frame(iframe);
//                break;
//            }
//        }
        WebElement contents = driver.findElement(By.className("workseditor-content"));
        contents.sendKeys("sdfs");

        driver.switchTo().defaultContent();

        WebElement send_btn = driver.findElement(By.className("button_write_task"));
        send_btn.click();
    }
}
