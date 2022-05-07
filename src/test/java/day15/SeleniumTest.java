package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    static WebDriver driver = new ChromeDriver(); // Java сама запускает драйвер сама

    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "bin");

        driver.get("https://selenium.dev");


    }
}
