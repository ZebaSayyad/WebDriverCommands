package tipsAndTricks;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadlessBrowser {

	public static void main(String[] args) {

		HtmlUnitDriver unitDriver=new HtmlUnitDriver();
		unitDriver.setJavascriptEnabled(true);
		
		unitDriver.get("https://www.google.com/");
		
		String title=unitDriver.getTitle();
		System.out.println("Title of the page is :"+title);
		
		unitDriver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		
		unitDriver.findElement(By.xpath(" //div[@class='FPdoLc VlcLAe']//input[@name='btnK']  ")).click();
		
		System.out.println("Title of the page is :"+unitDriver.getTitle());
		
		/*
		 * String domainName=(String)unitDriver.executeScript("return document.domain");
		 * System.out.println("Domain name is:"+domainName);
		 */	
	}

}
