package com.learn.dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;


public class dropdownexample1 {

	public static void main(String[] args) {
		try {
			ChromeOptions co=new ChromeOptions();
			co.addArguments("__remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.webmath.com");
			Thread.sleep(3000);
			WebElement Generalmath = driver.findElement(By.linkText("General Math"));
			Generalmath.click();
			WebElement topicItem = driver.findElement(By.id("topicItem")); 
			Select topicItemSelect= new Select(topicItem); 
			Thread.sleep(2000);
			 topicItemSelect.selectByVisibleText("Interest, Simple"); 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[name='principal']")).sendKeys("45");
			 Thread.sleep(2000);
			 WebElement interest = driver.findElement(By.cssSelector("input[name='interest']"));
			 interest.sendKeys("5");
			 Thread.sleep(2000);
			 WebElement annualIntrest = driver.findElement(By.cssSelector("select[name='interest_units']"));
			Select annualInterestselect= new Select (annualIntrest);
			 Thread.sleep(2000);
			 annualInterestselect.selectByIndex(2);
			 Thread.sleep(2000);
			 annualInterestselect.selectByIndex(0);
			 WebElement after = driver.findElement(By.cssSelector("input[name='desired_time']"));
	         after.sendKeys("10");
	         Thread.sleep(2000);
	         WebElement years = driver.findElement(By.cssSelector("select[name='desired_time_units']"));
	         Select yearsSelect=new Select(years);
	         Thread.sleep(2000);
	         yearsSelect.selectByIndex(1);
	         Thread.sleep(2000);
	         driver.findElement(By.cssSelector("input[type='submit']")).click();
	         
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
