package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewElement {

	public static void main(String[] args) {
		// Using selenium
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().window().maximize();

        //Launch the website
        driver.get("https://www.geeksforgeeks.org/");
        
        // Maximize the screen
        driver.manage().window().maximize();
        
        // Stating the Javascript Executor driver
        JavascriptExecutor js = (JavascriptExecutor) driver; 
        
        // Find Problem of the day text
        WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Web Development']"));
        
        // Scroll to the specific position
        js.executeScript("arguments[0].scrollIntoView();", element);
		
		
	
	}

}
