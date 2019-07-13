import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://www.myntra.com/";
		driver.get(url);
		driver.manage().window().maximize();

		// 1
		WebElement element = driver.findElement(By.className("desktop-searchBar"));
		element.sendKeys("Shirts For Men ");

		// 2
		element.clear();
		Thread.sleep(2000);

		// 3
		driver.findElement(By.xpath("//a[contains(text(),'Men')]")).click();

		// 4
		boolean select = driver.findElement(By.xpath("//a[contains(text(),'Men')]")).isSelected();
		System.out.println("Status is  :" + select);

		// 5
		boolean enable = driver.findElement(By.xpath("//a[contains(text(),'Women')]")).isEnabled();
		System.out.println("Enable :" + enable);

		// 6
		boolean display = driver.findElement(By.xpath("//a[contains(text(),'Kids')] [contains(@class,'desktop-main')]"))
				.isDisplayed();
		System.out.println("Display:" + display);

		// 7
		driver.findElement(By.xpath("//span[@class='desktop-userTitle'][@data-reactid='753']")).click();
		driver.findElement(By.xpath("//a[@class='desktop-linkButton'][contains(text(),'log in')]")).click();
		driver.findElement(By.xpath("//input[@class='login-user-input-email login-user-input']")).sendKeys("zebatanveer.2013@gmail.com");
		driver.findElement(By.xpath("//input[@class='login-user-input-password login-user-input']")).sendKeys("zeba9823");
		driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
		
		//8
		WebElement element1=driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
		String text=element1.getText();
		System.out.println("Text is :"+text);
		
		//9
		String tagName=element1.getTagName();
		System.out.println("Tag Name is:"+tagName);
		
		//10
		String attribute=element1.getAttribute("class");
		System.out.println("Attribute is :"+attribute);
		
		//11
		Dimension size=element1.getSize();
		System.out.println("Size is :"+size);
		
		
		
		
		

	}

	// 5

}
