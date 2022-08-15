package Denemeler_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q05_DriverControl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12.20));
        System.out.println(driver.manage().window());
        System.out.println("Hey dunya kontrol github");


    }
}
