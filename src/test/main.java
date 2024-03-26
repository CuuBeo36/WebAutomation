package test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\cuube\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cuube\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);
//        WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
//        driver.switchTo().frame(frame1);

        try
        {
            WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
            driver.switchTo().frame(frame1);
            WebElement frame2 = driver.findElement(By.id("ad_iframe"));
            driver.switchTo().frame(frame2);
            driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
        }   // try
        catch (Exception Ex)
        {
        }   // catch
            driver.switchTo().defaultContent();
            myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("SIGN-ON")));
            driver.findElement(By.linkText("SIGN-ON")).click();

////myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
////        driver.findElement(By.id("username").sendKeys("test"));
////        WebElement usermame = driver.findElement(By.name("username"));
////        WebElement password = driver.findElement(By.name("password"));
////        if (username.isEnabled()){
////            username.sendKeys("test");
////        }
////        do {
////            driver.findElement(By.name("submit")).click();
////        }
////        while (password.isEnabled());
//        if (driver.findElement(By.id("one-way")).isSelected());{
//            WebElement twoWay = driver.findElement(By.id("two-way"));
//            twoWay.click();
//        }
//
//
//
////        String baseUrl = "https://www.guru99.com/first-webdriver-script.html";
////        String expectedTitle = "Selenium Webdriver Java Program Example (Sample Code)";
////        String actualTitle = "";
////
////        // launch Fire fox and direct it to the Base URL
////        driver.get(baseUrl);
////
////        // get the actual value of the title
////        actualTitle = driver.getTitle();
////        System.out.println(actualTitle);
////        /*
////          String baseUrl = "https://techcombank.com/";
////          driver.get(baseUrl);
//
//        //Switch Frame
////        driver.get("http://demo.guru99.com/selenium/deprecated.html");
////        driver.switchTo().frame("packageFrame");
////        driver.findElement(By.linkText("Actions")).click();
////        driver.close();
//
//        //Switching Between Pop-up Windows
////        String alertMessage = "";
////
////        driver.get("http://jsbin.com/usidix/1");
////        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
////        alertMessage = driver.switchTo().alert().getText();
////        driver.switchTo().alert().accept();
//
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
////        System.out.println(alertMessage);
//
//
////          WebElement login;
////          login = driver.findElement(By.xpath("//button[@id='pages957-header2-button_login']"));
////          login.click();
//////          WebElement option1;
//////          option1 = driver.findElement(By.xpath("//div[@id='grow']/div/a"));
//////          option1.click();
//
//
////         * compare the actual title of the page with the expected one and print
////         * the result as "Passed" or "Failed"
////         */
////        if (actualTitle.contentEquals(expectedTitle)) {
////            System.out.println("Test Passed!");
////        } else {
////            System.out.println("Test Failed");
////        }
//
//        //close Fire fox
////        driver.close();
//    }
//}
//    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\cuube\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        String baseUrl = "http://www.facebook.com";
//        String tagName = "";
//
//        driver.get(baseUrl);
//        String a = driver.findElement(By.id("email")).getTagName();

//        WebElement username = driver.findElement(By.id("email"));
//        username.sendKeys("test");
        // driver.findElement(By.id("email")).;
    }
}

////        driver.findElement(By.name("login")).click();
//
//        System.out.println(a);
//        System.out.println(username);
//        System.out.println(driver.getCurrentUrl());
////        System.out.println(driver.getText((driver.findElement(By.id("email")))));
//        System.out.println("1");
//        System.out.println(username.getText());
//        System.out.println("2");
//
//        driver.get("https://www.google.com");
//        driver.quit();
//        System.exit(0);

//    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\cuube\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        String alertMessage = "";
//
//        driver.get("http://jsbin.com/usidix/1");
//        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
//        alertMessage = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
//
//        System.out.println(alertMessage);
//        driver.quit();

