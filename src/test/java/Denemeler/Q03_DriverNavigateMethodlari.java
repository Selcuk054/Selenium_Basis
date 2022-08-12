package Denemeler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q03_DriverNavigateMethodlari {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // 1- driver get ("url") --> istenen url e gider.
        //    driver.navigate().to("url") -->  ile ayni islemi yapar ama forward ve back yapilmasina inkan tanir

        driver.get("https://www.youtube.com/");
        driver.navigate().to("https://www.belsimpel.nl");

        //2- driver.navigate().back(); --> bir onceki sayfaya donus yapar

        driver.navigate().back();

        // 3- driver.navigate().forward(); --> back ile geldigi sayfaya geri doner.
        driver.navigate().forward();

        // 4-  driver.navigate().refresh(); --> icinde oldugu sayfayi yeniler

        driver.navigate().refresh();

        //deriver olusturuldugunda acilan sayfayi kapatmak istersek

        driver.close(); // birtane tab yada birtane window u kapatir

        driver.quit(); // driver calisirken birden fazla tab yada window actiysa tumunu kapatir


    }
}
