package tipsAndTricks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		try {
			Runtime.getRuntime().exec("C:\\Users\\PC\\Desktop\\Learnjxlfile.exe");
			Thread.sleep(2000);
		} catch (IOException e) {
			System.out.println("File not found");
		}
		driver.findElement(By.xpath("//img[@src='images/button_upload.gif']")).click();

	}

}
