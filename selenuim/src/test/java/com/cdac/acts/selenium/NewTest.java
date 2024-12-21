package com.cdac.acts.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://testdome.com/tests/java-selenium-online-test/209");
	  Thread.sleep(4000);
	  
	  WebElement webelement = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/div/div[2]/section[1]/a/span"));
	  webelement.click();
	  Thread.sleep(4000);
	  driver.close();
	  
  }
}
