package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BookingTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("DemoAdmin2");
        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("admin@123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        
//        driver.findElement(By.name("_username")).sendKeys("Admin@gmail.com");
//		driver.findElement(By.name("_password")).sendKeys("admin@123");
//        driver.findElement(By.xpath("//button[@class=\"b-button b-button b-button--block b-button--large b-button--secondary-yellow welcome-module-auth__action-button\"]")).click();
//        synchronized (driver) {
//           
//            driver.wait(); // Wait for a notification
//           
//        }
        driver.quit();
	}

}
