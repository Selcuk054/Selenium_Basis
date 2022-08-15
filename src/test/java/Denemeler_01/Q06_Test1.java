package Denemeler_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Q06_Test1 {
    public static void main(String[] args) throws InterruptedException {


    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.bol.com/nl/nl/");

        driver.manage().window().maximize();

        driver.navigate().refresh();
        String guncelBaslik= driver.getTitle();
        String arananKelime= "Bol";

        if (guncelBaslik.contains(arananKelime)){
            System.out.println("Baslikta" +  arananKelime +" kelimesi bulunmaktadir");
        }else {
            System.out.println("Baslikta" +  arananKelime +" kelimesi bulunmamaktadir");
        }

        System.out.println("Guncel baslik : "+ guncelBaslik);



        driver.close();
}
}