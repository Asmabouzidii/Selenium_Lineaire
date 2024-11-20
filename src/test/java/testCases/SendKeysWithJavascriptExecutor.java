package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithJavascriptExecutor {

		    public static void main(String[] args) {
		        /*WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://www.example.com");
		        
		        WebElement inputField = driver.findElement(By.id("inputFieldId")); // replace with actual ID or locator

		        // Use JavaScript to set the value
		        String text = "Your Text Here";
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].value='" + text + "';", inputField);

		        driver.quit();*/
		        
		    	    	
		    	    	//Open chrome browser
		    	    	WebDriver driver = new ChromeDriver();
		    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    			driver.manage().window().maximize();
		    	    	driver.get("https://www.facebook.com/?locale=fr_FR");

		                //Fill email and kenKeys with JavascriptExecutor
		                WebElement emailInput = driver.findElement(By.name("email"));
		                JavascriptExecutor js = (JavascriptExecutor) driver;
		                js.executeScript("arguments[0].value = 'souadhamdi@gmail.com';", emailInput);

		               //Fill password and kenKeys with JavascriptExecutor
		                WebElement passwordInput = driver.findElement(By.name("pass"));
		                js.executeScript("arguments[0].value = 'password';", passwordInput);

		               //Click on login Button
		                WebElement loginBtn = driver.findElement(By.name("login"));
		                loginBtn.click();
		                
		                
		    	        //driver.quit();
		    	    
		    	}

}
