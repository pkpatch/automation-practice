package com.sparta.eng82.stepdefs.utility;

import org.openqa.selenium.WebDriver;

public class WebDriverManager {

    public static WebDriver driver;


    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }

    public static void tearDown() {
        driver.close();
    }
}
