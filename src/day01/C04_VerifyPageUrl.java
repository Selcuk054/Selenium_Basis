package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
    public static void main(String[] args) {
        //Yeni bir class olusturalim : (VerifyURLTest)
        // techproeducation ana sayfasina gidelim https://www.techproeducation.com/

        System.setProperty("webdriver.chrome.driver","/Users/selcukkardes/Documents/Selenium Libraries/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        //Sayfa URL’inin www.techproeducation.com oldugunu dogrulayin

        String expectedUrl= "www.techproeducation.com";//beklenen url
        String actualUrl= driver.getCurrentUrl();//guncel url

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test Failed");
            System.out.println(" Gecerli URL : " + actualUrl);
        }
        driver.close();
    }
}
