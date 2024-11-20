package testCases;

import java.time.Duration;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SuperCalculator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://juliemr.github.io/protractor-demo/");
		
		WebElement firstNumber = driver.findElement(By.xpath("//input[@ng-model='first']"));
		firstNumber.sendKeys("100");
		
		WebElement secondNumber = driver.findElement(By.xpath("//input[@ng-model='second']"));
		secondNumber.sendKeys("200");
		
		WebElement equalBtn = driver.findElement(By.id("gobutton"));
		equalBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Pattern pattern = Pattern.compile("\\d+");
		
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
	
		WebElement result = driver.findElement(By.tagName("h2"));
		
		System.out.println("The result is: " +result);
				
		result.getText();
	
	}

}
