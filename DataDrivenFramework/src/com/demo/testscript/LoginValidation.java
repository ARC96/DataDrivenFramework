package com.demo.testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class LoginValidation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream ifs=new FileInputStream("H:\\1.Selenium Project\\DataDrivenFramework\\src\\com\\demo\\utilities\\DataDriven.properties");
		Properties	p=new Properties();
		p.load(ifs);
		String url=p.getProperty("url");
		String email=p.getProperty("email");
		String pwd=p.getProperty("pwd");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(url);
	    driver.findElement(By.xpath("//i[@ class='fa fa-user']")).click();
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
	    driver.findElement(By.xpath("//span[text()='Login']")).click();
	    
	    driver.quit();
	    
	    
		

	}

}
