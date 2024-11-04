package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HelloWorld {
    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--remote-allow-origins=*");

        // Initialize WebDriver with Firefox
        WebDriver driver = new FirefoxDriver(options);

        // Maximize browser window
        driver.manage().window().maximize();

        // Do some actions with the driver
        driver.get("https://www.google.com");

        // Quit the browser session
        driver.quit();
    }
}
