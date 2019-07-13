
  import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver;
  
  public class BrowserCommands {
  
  public static void main(String[] args) throws Exception {
  
		
		  System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
		  String url = "https://www.flipkart.com/";
		  
		  driver.get(url); String title = driver.getTitle();
		  System.out.println("Title :" + title);
		  
		  String currentUrl = driver.getCurrentUrl(); System.out.println("CurrentUrl :"
		  + currentUrl);
		  
		  String pageSource = driver.getPageSource();
		  System.out.println("PageSource Length is :" + pageSource.length());
		  
		  driver.quit();
		  driver.close();
		  
		
		  
  } }
 