package testCases;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		
		public class SendKeysJS {


			public static void main(String[] args) {
				

				        WebDriver driver = new ChromeDriver();
				        
				        // Maximize browser
				        driver.manage().window().maximize();
				        
				        // Delete cookies
				        driver.manage().deleteAllCookies();
				        driver.get("https://demoqa.com/text-box");
				        
				        // Locate the input element
				        WebElement inputElement = driver.findElement(By.id("userName"));
				        
				        // Use JavaScript to send keys
				        JavascriptExecutor js = (JavascriptExecutor) driver;
				        js.executeScript("arguments[0].setAttribute('value', 'Maryouma');", inputElement);
				        
				        // Close the WebDriver
				        //driver.quit();
				    }
						
	}

