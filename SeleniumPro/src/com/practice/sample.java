package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;



public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SDrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        
        
	}

}
