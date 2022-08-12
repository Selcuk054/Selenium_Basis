package Denemeler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02_DriverGetMethodlari{

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // 1- Driver.get ("url") -->yazdigimiz url ye gider

        driver.get("https://www.youtube.com/");

        //2- driver.getTitle() --> icinde bulundugu sayfanin basligini dondurur.

        System.out.println("Sayfa Title : "+ driver.getTitle()); //gittigi sitenin basligini getirir.

        //3- driver.getCurrentUrl() ---> icinde oldugu sayfanin URL sini dondurur.

        System.out.println("Sayfanin Url si : "+ driver.getCurrentUrl());

        // 4- driver.getPageSource()---> icinde oldugu sayfanin kaynak kodlarini dondurur

        System.out.println("===================================");
        System.out.println(driver.getPageSource());
        System.out.println("===================================");

        // 5- driver.getWindowHandle() ---> icinde oldugu sayfanin UNIQUE hash kodunu dondurur.

        System.out.println(driver.getWindowHandle()); //CDwindow-E3C43AD5BDE1D8E940B86773EFDEABA8

        // 6- driver.getWindowHandles() -->  driver calisirken acilan tun sayfalarin UNIQUE hash kodunu dondurur.

        System.out.println(driver.getWindowHandles()); // [CDwindow-C6218895F003014FCE4C2EFF74651A52]




    }

}
