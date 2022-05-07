package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;

import static java.time.LocalTime.now;

public class Booking {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://booking.com");
        driver.findElement(By.name("ss")).sendKeys("Париж"); // By.xpath...., By.id....., By.name
        driver.findElement(By.xpath("//span[text()='Париж']")).click();

        LocalDate dateFrom = LocalDate.now(ZoneId.systemDefault());
        LocalDate dateTo = dateFrom.plusDays(7);

        driver.findElement(By.xpath(String.format("//*[@data-date='%s']",dateFrom))).click();
        driver.findElement(By.xpath(String.format("//*[@data-date='%s']",dateTo))).click();
        driver.findElement(By.id("xp__guests__toggle")).click();
        driver.findElement(By.xpath("//span[@id='group_adults_desc']/preceding-sibling::button[1]")).click();
        driver.findElement(By.xpath("//span[@id='group_adults_desc']/preceding-sibling::button[1]")).click();
        driver.findElement(By.xpath("//span[@id='no_rooms_desc']/preceding-sibling::button[1]")).click();
        driver.findElement(By.className("sb-searchbox__button")).click();



//        driver.quit();


    }
}
