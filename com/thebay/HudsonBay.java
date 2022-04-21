package com.thebay;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class HudsonBay {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiva\\eclipse-workspace\\My Project\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.thebay.com/#");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.xpath("//span[@id='consent-close']")).click();  
    driver.findElement(By.xpath("//input[@class='form-control search-field proxi-common'][1]")).sendKeys("tshirts",Keys.ENTER);
    driver.findElement(By.className("thumb-link")).click();
    driver.findElement(By.xpath("//a[@data-adobelaunchproductsize='Medium']")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.xpath("//button[contains(text(),'Add to Bag')]")).click();
	
	
}
}
