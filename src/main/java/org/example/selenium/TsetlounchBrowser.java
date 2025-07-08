package org.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsetlounchBrowser {

    public void lounchbrowser(){
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        String URL = driver.getCurrentUrl();
        System.out.println("Page URL is: " + URL);
        driver.quit();
    }
}
