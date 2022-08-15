package Denemeler_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Q04_DriverManageMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //1 driver.manage().window().getSize();

        driver.manage().window().getSize(); // icerisinde oldugumuz sayfanin pixel olarak olculerini dondurur.

        // 1 a-  driver.manage().window().getSize());

        System.out.println(driver.manage().window().getSize()); // (1200, 746) pixel

        //1 b-  driver.manage().window().getPosition(); --> icinde oldugu sayfanin pixel olara koordinatlarini verir.
        driver.manage().window().getPosition();
        System.out.println(driver.manage().window().getPosition()); //22 47

        //1 c- driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setPosition(new Point(15,15));
        // icinde oldugu sayfanin alt kosesini bizim yazcagimiz pixel noktasina tasir

        // 1 d- driver.manage().window().setSize(new Dimension(900,1500));
        driver.manage().window().setSize(new Dimension(900,1500));
        // icinde oldugu sayfanin alt kosesi sabit olarak bizim yazacagimiz olculere getirir.


        //1 E  driver.manage().window().maximize(); --> icinde oldugu sayfayi maximize yapar.
        driver.manage().window().maximize();

        //1 F    driver.manage().window().fullscreen(); --> icinde oldugu sayfayi fullscrenne yapar.
        driver.manage().window().fullscreen();
        
        
        //1 G driver.manage().window().minimize();  acik sayfayi simge edurumuna kucultur.
        // driver.manage().window().minimize();

        // 2-
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        Wait konusunu ilerde tek basina ele alacagiz ancak her class icin yapmamiz
        gerekn bir ayr oldugu icin burada kisaca deginelim.
        implicitlyWait: Driver a sayfanin yuklenmesi ve kullanacagimiz web elementlerin bulunmasi
        icin bekleyecegi maximum sureyi belirtir.
        Driver u sure icinde sayfa yuklenir/web element bulunursa beklemeden calismaya devam eder.
        Bu sure bittigi halde syfa yuklenmemis/webelement bulunamamissa exception vererek calismayi durdurur

        Duration.ofSecands(10) : Duration class i Selenium 4 ile gelen zaman class idir.
        Yani driver a ne kadar bekleyecegini soyler.
        Duration.ofSeconds(15) yerine milis, minutes,hours da kullanilabilir
         */

        

    }
}
