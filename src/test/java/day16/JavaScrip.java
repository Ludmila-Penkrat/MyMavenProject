package day16;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScrip {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

//        driver.manage().window().maximize();

        driver.get("https://booking.com");
        driver.findElement(By.name("ss")).sendKeys("Париж"); // By.xpath...., By.id....., By.name
        driver.findElement(By.xpath("//span[text()='Париж']")).click();

        driver.findElement(By.xpath("//*[@data-date='2022-05-04']")).click();
        driver.findElement(By.xpath("//*[@data-date='2022-05-11']")).click();
        driver.findElement(By.className("sb-searchbox__button")).click();



        WebElement element = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green';", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red';", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

        String actualColor = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]")).getCssValue("color");
        System.out.println(actualColor);
        Assert.assertEquals("Атрибут цвета не верный", "rgba(255, 0, 0, 1)", actualColor);

        driver.close();
    }
}
