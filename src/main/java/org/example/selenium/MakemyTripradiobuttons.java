package org.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakemyTripradiobuttons {

    @Test
    public void validateRadioButtons() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
        driver.findElements(By.xpath("//*[@class=\"custom-control custom-radio custom-control-inline\"]")).forEach(radioButton -> {
            if (radioButton.isEnabled()) {
                radioButton.click();
                System.out.println("Radio button with value '" + radioButton.getAttribute("value") + "' is selected.");
            } else {
                System.out.println("Radio button with value '" + radioButton.getAttribute("value") + "' is disabled.");
            }
        });
    }
}
