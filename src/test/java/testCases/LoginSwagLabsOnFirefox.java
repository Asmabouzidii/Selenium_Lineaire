package testCases;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSwagLabsOnFirefox {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Maximize window
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		
		// Open URL application
		driver.get("https://www.saucedemo.com/");
		
		// Fill username
		/*driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");*/
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.clear();
		username.sendKeys("standard_user");

		// Fill password
		/*driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");*/
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.clear();
		passwrd.sendKeys("secret_sauce");
		
		// Fill username
		/*driver.findElement(By.id("login-button")).click();*/
		
		// Click on login button
		/*WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();*/
		
		// Click on login button using explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
		loginBtn.click();
		
		// Validation enter home page
		String textProduct = driver.findElement(By.xpath("//span[@class='title']")).getText();
		Assertions.assertEquals(textProduct, "Products");
		
		
		// Print screen message
		System.out.println("Login successfully");
		
		// Kill session
		//driver.quit();
	}

}
