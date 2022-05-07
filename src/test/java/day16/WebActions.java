package day16;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class WebActions {

    static WebDriver driver = new ChromeDriver();


    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

//        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/java/");

        WebElement nameField = driver.findElement(By.xpath("//span[@class='color_h1']"));

        Actions make = new Actions(driver);

        make
                .doubleClick(nameField)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyUp(Keys.LEFT_CONTROL)
                .build().perform();

        driver.navigate().to("https://google.com");

        make
                .click(driver.findElement(By.name("q")))
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyUp(Keys.LEFT_CONTROL)
                .sendKeys(Keys.ENTER)
                .build().perform();

        int resultAmount = driver.findElements(By.xpath("//div[contains(@class, 'g') and contains(., 'tutorial')]")).size();

        Assert.assertEquals(12, resultAmount);

        driver.close();










    }
}
