package Denemeler_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Q01_TestRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       driver.get("https://www.bol.com/nl/nl/");
        System.out.println("suandaki url : "+driver.getCurrentUrl());
        System.out.println("su anki baslik : "+ driver.getTitle());

        driver.navigate().to("https://www.bol.com/nl/nl/klantenservice/index.html");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(2000);


        driver.quit();







    }
}
