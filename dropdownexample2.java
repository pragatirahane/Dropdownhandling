package com.learn.dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class dropdownexample2 {

	public static void main(String[] args) {
	try {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.webmath.com");
	Thread.sleep(3000);
	driver.findElement(By.linkText("General Math")).click();
	Thread.sleep(3000);
	WebElement choose = driver.findElement(By.cssSelector("select[name='topicItem']"));
	Select chooseSelect=new Select(choose);
	Thread.sleep(3000);
	chooseSelect.selectByVisibleText("Interest, Compound");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[maxlength='10']")).sendKeys("26");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name='interest']")).sendKeys("3");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[maxlength='5']")).sendKeys("4");
	WebElement desiredtime = driver.findElement(By.name("desired_time"));
	desiredtime.sendKeys("10");
	Thread.sleep(3000);
	WebElement newamount = driver.findElement(By.cssSelector("input[type='submit']"));
	newamount.click();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
