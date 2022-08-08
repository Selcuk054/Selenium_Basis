package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {
    public static void main(String[] args) {
        //Yeni bir Class olusturalim. (VerifyTitle)
        //Amazon ana sayfasina gidelim . https://www.amazon.com/

        System.setProperty("webdriver.chrome.driver","/Users/selcukkardes/Documents/Selenium Libraries/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        //Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)

        String expectedTitle="amazon"; //beklenen baslik
        String actualTitle= driver.getTitle(); //actuel basligi getir.

        if (expectedTitle.equals(actualTitle)){ //actuel baslik ile beklenen basligi karislastir
            System.out.println("title beklenen deger ile ayni, test PASS"); //ayni ise bunu yazdir
        }else{
            System.out.println("title beklenenden farkli, test FAILED"); //ayni degilse bunu yazdir
            System.out.println("aktuel title : " + driver.getTitle());//ve guncel basligi yazdir
        }

        driver.close();//sayfayi kapat
    }
}
