package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		
		String title = driver.getTitle();
		int lengthTitle = title.length();
		
		System.out.println("The title is :" +title);

		System.out.println("The length of the title is :" +lengthTitle);
	
		String actualUrl = driver.getCurrentUrl();
		
		if (actualUrl.equals(url)) {
			System.out.println("Verification successful - the correct url is opened");
		}
		else {
			System.out.println("Verification failed - incorrect url is opened");
		}
		
		System.out.println(actualUrl);
		System.out.println(url);
		
		String pageSource = driver.getPageSource();
		int lengthPageSource = pageSource.length();
		
		System.out.println(lengthPageSource);

		driver.quit();

	}

}