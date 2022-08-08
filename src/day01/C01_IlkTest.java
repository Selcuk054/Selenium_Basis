package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/selcukkardes/Documents/Selenium Libraries/Drivers/chromedriver"); //Web driver i oldugu yerin yolunu cift tirnak ile buraya ekle

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/"); //driver kullanarak buradaki url kodundaki adese gir
        System.out.println("suandaki url : "+driver.getCurrentUrl()); //suanki url yi yazdr
        System.out.println("su anki baslik : "+ driver.getTitle()); //suanki basligi yazdir
        driver.manage().window().maximize(); //sayfayi buyukt maximize et
        Thread.sleep(3000); //3 sn bekle

        driver.navigate().to("https://www.techproeducation.com"); //burdaki url ye gecis yap
        Thread.sleep(2000); //2 sn bekle
        driver.navigate().back(); //geri don
        Thread.sleep(2000);//iki sanie bekle


        driver.navigate().forward(); //ileri git
        Thread.sleep(2000); //iki saniye bekle

        driver.navigate().refresh(); //sayfayi yenile
        Thread.sleep(2000);//iki saniye bekle

        // driver.quit(); quit acik olan tum browser'lari kapatirken 'close' sadece 1 browser kapatir


        driver.close(); //

    }

}
