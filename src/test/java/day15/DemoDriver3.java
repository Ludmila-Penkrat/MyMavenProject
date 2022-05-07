package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDriver3 {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");

        driver.findElement(By.xpath("\\input[@title='Шукаць'"));


    }
}