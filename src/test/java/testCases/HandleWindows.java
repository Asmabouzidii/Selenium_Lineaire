package testCases;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		WebElement pub = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		pub.click();

		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space(text())='Testing']")));
		menu.click();
		
		WebElement subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu-item-4571']//a[contains(text(),'Cucumber')]")));
		subMenu.click();

		String expectedUrl = "https://www.guru99.com/cucumber-tutorials.html";
		String actualURL = driver.getCurrentUrl();
		Assertions.assertEquals("the URL after clicking the submenu is incorrect", expectedUrl, actualURL);

	}

}
