package com.class26;

public class WebDriverTest {
	
	public static void main(String[] args) {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.refresh();
		chrome.open();
		System.out.println("---------------");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.refresh();
		firefox.open();
		System.out.println("---------------");
		//Creating an object of child class given reference to the parent
		WebDriver driver=new ChromeDriver();
		driver.open();
		driver.refresh();
		//no access to child specific class through Parent type
	}

}
