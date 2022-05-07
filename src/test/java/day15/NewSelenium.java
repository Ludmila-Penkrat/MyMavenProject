package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NewSelenium {


    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions()); // запускаем в ручную через cmd

        driver.get("https://onliner.by");
        WebElement el = driver.findElement(By.className("onliner_logo")); // By.xpath...., By.id....., By.name
        el.click();
        driver.close();
    }
}
