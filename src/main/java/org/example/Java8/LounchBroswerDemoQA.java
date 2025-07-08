package org.example.Java8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBroswerDemoQA {

    @Test
    public void lounch() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        driver.findElement(By.id("firstName")).sendKeys("John");

    }
}