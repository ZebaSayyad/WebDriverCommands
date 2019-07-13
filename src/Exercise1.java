import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.amazon.in/";
		
		//2
		driver.get(url);
		
		//3 & 4
		String pageTitle=driver.getTitle();
		System.out.println("Page Title is :"+pageTitle);
		System.out.println("Page Title Length is:"+pageTitle.length());
		
		//5
		String pageUrl=driver.getCurrentUrl();
		
		if(pageUrl.equals(url))
		{
			System.out.println("Correct page is opened");
		}
		else
		{
			System.out.println("Url is not matched");
		}
		
		//6
		String pageSource=driver.getPageSource();
		int pageSourceLength=pageSource.length();
		System.out.println("Page Source Length is :"+pageSourceLength);
		
		//7
		driver.close();
		
		
	}

}
