package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//    	driver.get("https://selenium.dev");
//	    driver.get("http://www.google.com");
//		driver.get("http://www.bigOven.com");
//		driver.get("https://letyshops.com/in");
//		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
//		driver.findElement(By.name("q")).click();
//		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
//		driver.wait(1000);
//		driver.quit();
//		driver.findElement(By.xpath("//a[text()='Planner']")).click();
//		driver.findElement(By.xpath("//div[@class='hidden lg:flex items-center']/child::button[@class='flex items-center text-xs h-8 rounded bg-gray-300 hover:bg-gray-400 outline-none focus:outline-none px-6']")).click();
//		driver.findElement(By.name("_username")).sendKeys("Admin");
//		driver.findElement(By.name("_password")).sendKeys("admin@123");
//		driver.findElement(By.xpath("//button[@class='b-button b-button--block b-button--large b-button--secondary-yellow']")).click();
//		driver.wait(300);
//		driver.quit();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		//driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");;
		//driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
		driver.wait(100);
		driver.quit();

	}

}
